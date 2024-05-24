package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import com.util.EmployeeRegistrationConnection;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeRegistrationForm employee = new EmployeeRegistrationForm();
	EmployeeImplements implement = new EmployeeImplements();
	List<EmployeeRegistrationForm> list = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Update() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String Name = request.getParameter("Name");
		employee.setName(Name);
		String Password = request.getParameter("Password");
		employee.setPassword(Password);
		String Mail_Id = request.getParameter("Mail_Id");
		employee.setMail_Id(Mail_Id);
		String PhoneNumber = request.getParameter("PhoneNumber");
		employee.setPhoneNumber(PhoneNumber);
        
        try {
        	implement.update(employee);
            
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        try {
            list=implement.read1EmployeeData();    
            
            
             
        }
        catch (ClassNotFoundException | SQLException e) {
              
               e.printStackTrace();
           }
        request.setAttribute("list", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
        dispatcher.forward(request, response);
    }

//		try {
//			implement.update(employee);
//			PrintWriter writer = response.getWriter();
//			writer.println(employee.getName() + "updated\n" + employee.getPassword() + "updated\n"
//					+ employee.getMail_Id() + "updated\n" + employee.getPhoneNumber() + "updated\n");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//
//		String action = request.getParameter("action");
//		if (action != null) {
//			switch (action) {
//			case "update":
//				@SuppressWarnings("unused") 
//				String name = request.getParameter(Name);
//				employee.setName(Name);
//				try {
//					update(request, response);
//				} catch (ClassNotFoundException | SQLException e) {
//					e.printStackTrace();
//				}
//				break;
//
//			}
//			request.setAttribute("list", list);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
//			dispatcher.forward(request, response);
//
//		}
//
//	}
//
//	public void update(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, ClassNotFoundException, SQLException {
//		String Name = request.getParameter("Name");
//		String Password = request.getParameter("Password");
//		String Mail_Id = request.getParameter("Mail_Id");
//		String PhoneNumber = request.getParameter("PhoneNumber");
//		EmployeeRegistrationForm employee = new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber);
//		implement.update(employee);
//		response.sendRedirect("EmployeeRegistrationJSP.jsp");
//
//	}
//
}
