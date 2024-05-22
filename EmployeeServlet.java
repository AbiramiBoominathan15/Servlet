package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
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
		employee.setName(Name);
		String Password = request.getParameter("Password");
		employee.setPassword(Password);
		String Mail_Id = request.getParameter("Mail_Id");
		employee.setMail_Id(Mail_Id);
		String PhoneNumber = request.getParameter("PhoneNumber");
		employee.setPhoneNumber(PhoneNumber);

		try {
			implement.registration(employee);
			PrintWriter writer = response.getWriter();
			writer.println(employee.getName() + "added");
			writer.println(employee.getPassword() + "added");
			writer.println(employee.getMail_Id() + "added");
			writer.println(employee.getPhoneNumber() + "added");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		try {
			implement.delete(employee);
			PrintWriter writer = response.getWriter();
			writer.println(employee.getName() + "added");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		list.add(new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber));
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
		dispatcher.forward(request, response);
	}
		}

//		try {
//			implement.registration1(Mail_Id);
//			PrintWriter writer = response.getWriter();
//			writer.println(employee.getName() + "added");
//			writer.println(employee.getPassword() + "added");
//			writer.println(employee.getMail_Id() + "added");
//			writer.println(employee.getPhoneNumber() + "added");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		//		try {
//			listUser(request, response);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//
		
//
//	public void listUser(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, SQLException, ClassNotFoundException, ServletException {
//		List<EmployeeRegistrationForm> list = implement.read1EmployeeData();
//		request.setAttribute("list", list);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
//		dispatcher.forward(request, response);
//
//	}
//}
//
//		String action = request.getServletPath();
//		switch (action) {
//		case "/new":
//			showNewForm(request, response);
//			break;
//		case "/insert":
//			try {
//				insert(request, response);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//		case "/delete":
//			try {
//				delete(request, response);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//
//			break;
//		case "/edit":
//			try {
//				showEditEmployee(request, response);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//		case "/update":
//			try {
//				updateEmployee(request, response);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//		default:
//			try {
//				listUser(request, response);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//		}
//	}
//
//	public void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	public void insert(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, ClassNotFoundException, SQLException {
//		String Name = request.getParameter("Name");
//		String Password = request.getParameter("Password");
//		String Mail_Id = request.getParameter("Mail_Id");
//		String PhoneNumber = request.getParameter("PhoneNumber");
//
//		EmployeeRegistrationForm employee = new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber);
//		implement.registration(employee);
//		response.sendRedirect("list");
//	}
//
//	public void delete(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, ClassNotFoundException, SQLException {
//		String Name = request.getParameter("Name");
//		implement.deleteEmployeeData(Name);
//		response.sendRedirect("list");
//	}
//
//	public void showEditEmployee(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, SQLException, ClassNotFoundException, ServletException {
//		String Name = request.getParameter("Name");
//		EmployeeRegistrationForm employee1 = implement.readEmployeeData(Name);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
//		request.setAttribute("employee", employee1);
//		dispatcher.forward(request, response);
//	}
//
//	public void updateEmployee(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, SQLException, ClassNotFoundException, ServletException {
//
//		String Name = request.getParameter("Name");
//		String Password = request.getParameter("Password");
//		String Mail_Id = request.getParameter("Mail_Id");
//		String PhoneNumber = request.getParameter("PhoneNumber");
//
//		EmployeeRegistrationForm employee = new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber);
//		implement.updateEmployeeData(employee);
//		response.sendRedirect("list");
//
//	}
//
