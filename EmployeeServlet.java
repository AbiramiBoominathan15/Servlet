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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("do Post method");
		String Name = request.getParameter("Name");
		System.out.print("Welcome "+Name);  
		  
	    Cookie ck=new Cookie("Name",Name);  
	    response.addCookie(ck);

		employee.setName(Name);
		String Password = request.getParameter("Password");
		employee.setPassword(Password);
		String Mail_Id = request.getParameter("Mail_Id");
		employee.setMail_Id(Mail_Id);
		String PhoneNumber = request.getParameter("PhoneNumber");
		employee.setPhoneNumber(PhoneNumber);
		

		try {
			implement.registration(employee);
            HttpSession session = request.getSession();
            session.setAttribute("Name",Name);

			PrintWriter writer = response.getWriter();

			writer.println(employee.getName() + "added");
			writer.println(employee.getPassword() + "added");
			writer.println(employee.getMail_Id() + "added");
			writer.println(employee.getPhoneNumber() + "added");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		try {
			listUser(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		list.add(new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber));
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
		dispatcher.forward(request, response);
		
	}

	public void listUser(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException, ClassNotFoundException, ServletException {
		List<EmployeeRegistrationForm> list = implement.read1EmployeeData();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
		dispatcher.forward(request, response);
	}

}