package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.EmployeeRegistrationForm;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")

public class EmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	List<EmployeeRegistrationForm> list = new ArrayList<EmployeeRegistrationForm>();
	EmployeeRegistrationForm employee = new EmployeeRegistrationForm();
	EmployeeImplements implement = new EmployeeImplements();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {

		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    String Name = request.getParameter("Name");
	    String Password = request.getParameter("Password");
	    String Mail_Id = request.getParameter("Mail_Id");
	    String PhoneNumber = request.getParameter("PhoneNumber");

	    EmployeeRegistrationForm employee = new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber);

	    try {
	        implement.registration(employee);

	        HttpSession session = request.getSession();
	        session.setAttribute("Name", Name);

	        Cookie nameCookie = new Cookie("Name", Name);
	        Cookie passwordCookie = new Cookie("Password", Password);
	        Cookie mailCookie = new Cookie("Mail_Id", Mail_Id);
	        Cookie phoneCookie = new Cookie("PhoneNumber", PhoneNumber);

	        response.addCookie(nameCookie);
	        response.addCookie(passwordCookie);
	        response.addCookie(mailCookie);
	        response.addCookie(phoneCookie);

	        PrintWriter writer = response.getWriter();
	        writer.println(employee.getName() + " added");
	        writer.println(employee.getPassword() + " added");
	        writer.println(employee.getMail_Id() + " added");
	        writer.println(employee.getPhoneNumber() + " added");
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }

	    listUser(request, response);

	    List<EmployeeRegistrationForm> list = new ArrayList<>();
	    list.add(employee);
	    request.setAttribute("list", list);

	    RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
	    dispatcher.forward(request, response);
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
}
