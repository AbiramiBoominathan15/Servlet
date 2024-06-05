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

import com.model.Hotel;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Hotel> list = new ArrayList<Hotel>();
	Hotel hotel = new Hotel();
	HungerImplements implement = new HungerImplements();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLogin() {
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
		String hotelName = request.getParameter("name");
		String hotelLocation = request.getParameter("location");
		String hotelPhoneNumber = request.getParameter("phonenumber");

		hotel.setHotelName(request.getParameter("name"));
		hotel.setHotelLocation(request.getParameter("location"));
		hotel.setHotelPhoneNumber(request.getParameter("phonenumber"));
		try {
			HungerImplements.hotelDetails(hotel);
			List<Hotel> list = implement.read1();
			request.setAttribute("list", list);

			RequestDispatcher dispatcher = request.getRequestDispatcher("Hotel.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String adminName = "abirami@13";
		String adminPassword = "abirami#23";
		if (name.equals(adminName) && password.equals(adminPassword)) {
			response.sendRedirect("Hotel1.html");
		} else {
			response.sendRedirect("AdminLogin.html");
		}

	}
	
}
