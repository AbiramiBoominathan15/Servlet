package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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
		doGet(request, response);
		System.out.println("do Post method");
		String  UserName= request.getParameter("Name");
		String Password= request.getParameter("Password");
		String confirmPassword= request.getParameter("Password");
		String Email= request.getParameter("Email");
		String Gender= request.getParameter("gender");
		String dateOfBirth= request.getParameter("dob");
		String Age= request.getParameter("age");
		String Phonenumber= request.getParameter("phonenumber");
		PrintWriter out= response.getWriter();
	    out.println(UserName); 
	    out.println(Password);
	    out.println(confirmPassword);
	    out.println(Email); 
	    out.println(Gender); 
	    out.println(dateOfBirth); 
	    out.println(Age); 
	    out.println(Phonenumber); 

		
		


	}

}
