package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.EmployeeRegistrationForm;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	EmployeeRegistrationForm employee= new EmployeeRegistrationForm();
	EmployeeImplements implement= new EmployeeImplements();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeRegistrationForm employee= new EmployeeRegistrationForm();

		doGet(request, response);
		System.out.println("do Post method");
	       String Name = request.getParameter("Name");
	      employee.setName(Name);
	       String Mail_Id = request.getParameter("Mail_Id");
	      employee.setMail_Id(Mail_Id);
	       String PhoneNumber = request.getParameter("PhoneNumber");
	      employee.setPhoneNumber(PhoneNumber);

	      try {
	    	  implement.registration(employee);
	           PrintWriter writer = response.getWriter();
	           writer.println(employee.getName() + "added");
	           writer.println(employee.getMail_Id() + "added");
	           writer.println(employee.getPhoneNumber() + "added");

	       } catch (ClassNotFoundException | SQLException e) {
	           // TODO Auto-generated catch block
	           e.printStackTrace();
	       }
		
	}

}
