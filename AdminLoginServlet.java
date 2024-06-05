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
import javax.servlet.http.HttpSession;

import com.model.UserDetails;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<UserDetails> list = new ArrayList<UserDetails>();
	UserDetails user = new UserDetails();
	HungerImplements implement = new HungerImplements();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String name = request.getParameter("name");
//		user.setName(name);
//		String password = request.getParameter("password");
//		user.setPassword(password);
//		try {
//			String password1 = HungerImplements.loginCheck(name);
//			if (password.equals(password1)) {
//				request.getRequestDispatcher("Signup.html").forward(request, response);
//			} else {
//				request.getRequestDispatcher("LoginPage.html").forward(request, response);
//			}
//
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
//	    String adminname = request.getParameter("adminname");
//	    String adminpassword = request.getParameter("adminpassword");
//	    try {
//	        implement.adminLogin(adminname,adminpassword);
//
//	}catch (SQLException | ClassNotFoundException e) {
//        e.printStackTrace();
//    }
		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phonenumber");
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		String mailId = request.getParameter("mailId");

		user.setName(request.getParameter("name"));
		user.setPhoneNumber(request.getParameter("phonenumber"));
		user.setPassword(request.getParameter("password"));
		user.setCity(request.getParameter("city"));
		user.setMailId(request.getParameter("mailId"));
		System.out.println("phonenumber:" + phoneNumber);
		try {
			implement.userlogin(user);
			List<UserDetails> list = implement.read();
			request.setAttribute("list", list);

			RequestDispatcher dispatcher = request.getRequestDispatcher("hunger.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

//		String action = request.getParameter("action");
//		System.out.println(action);

		
		
//		switch (action) {
//		case "register":
//
//			try {
//
//				System.out.println("method calling");
//				if (implement.userlogin(user)) {
//					System.out.println("1");
//					HttpSession session = request.getSession();
//					session.setAttribute("name", name);
//					session.setAttribute("phonenumber", phoneNumber);
//					session.setAttribute("password", password);
//					session.setAttribute("city", city);
//					session.setAttribute("mailId", mailId);
//////					listUser(request, response);
////					
//					List<UserDetails> list = implement.read();
//					request.setAttribute("list", list);
//
//					RequestDispatcher dispatcher = request.getRequestDispatcher("hunger.jsp");
//					dispatcher.forward(request, response);

//					response.sendRedirect("Index.html");
//
//				}
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//
//		case "login":
//
////			try {
////				if (HungerImplements.userlogin(user)) {
////					response.sendRedirect("LoginPage.html");
////
////				}
////			} catch (ClassNotFoundException | SQLException e) {
////				e.printStackTrace();
////				response.sendRedirect("hunger.jsp");
////			}
////			break;
//
//		}
//	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

}
