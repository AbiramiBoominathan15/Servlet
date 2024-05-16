package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.UserRegistration;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<UserRegistration>list=new ArrayList<UserRegistration>();
       
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
		String  userName= request.getParameter("Name");
		String password= request.getParameter("Password");
		String confirmPassword= request.getParameter("Password");
		String email= request.getParameter("Email");
//		String gender= request.getParameter("gender");
		String dateOfBirth= request.getParameter("dob");
		String age= request.getParameter("age");
		String phonenumber= request.getParameter("phonenumber");
		list.add(new UserRegistration(userName,password,confirmPassword,email,dateOfBirth,age,phonenumber));
        request.setAttribute("list", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Registration.jsp");
        dispatcher.forward(request, response);

        }



	}
	

