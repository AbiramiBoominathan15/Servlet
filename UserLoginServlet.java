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

import com.model.UserLogin;
import com.model.UserLogin;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserLogin user = new UserLogin();
	List<UserLogin> list = new ArrayList<UserLogin>();
	UserLoginDAO login = new UserLoginDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLoginServlet() {
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
		System.out.println("do Post method");
		String UserName = request.getParameter("UserName");
		user.setUserName(UserName);
		String UserPassword = request.getParameter("UserPassword");
		user.setUserPassword(UserPassword);

		try {
			login.insert(user);
			PrintWriter writer = response.getWriter();
			writer.println(user.getUserName() + "added");
			writer.println(user.getUserPassword() + "added");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		try {
			listUser(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		list.add(new UserLogin(UserName, UserPassword));
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Userlogin.jsp");
		dispatcher.forward(request, response);

	}

	public void listUser(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException, ClassNotFoundException, ServletException {
		List<UserLogin> list = login.read();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Userlogin.jsp");
		dispatcher.forward(request, response);
	}

}
