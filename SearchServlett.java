package com.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.EmployeeRegistrationForm;

/**
 * Servlet implementation class SearchServlett
 */
@WebServlet("/SearchServlett")
public class SearchServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeRegistrationForm employee = new EmployeeRegistrationForm();
	EmployeeImplements implement = new EmployeeImplements();
	List<EmployeeRegistrationForm> list = new ArrayList<>();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlett() {
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
		String Name = request.getParameter("Search");
		System.out.println();
		
        
        try {
        	request.setAttribute("list", implement.search(Name));
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
       
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
        dispatcher.forward(request, response);
    }


	}


