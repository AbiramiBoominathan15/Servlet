package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.EmployeeRegistrationForm;
import com.util.EmployeeRegistrationConnection;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeRegistrationForm employee = new EmployeeRegistrationForm();
	EmployeeImplements implement = new EmployeeImplements();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteServlet() {
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

		doGet(request, response);
		String Name = request.getParameter("Name");
		employee.setName(Name);
		
		
		
		
		

		try {
			implement.deleteEmployeeData(Name);
			PrintWriter writer = response.getWriter();
			writer.println(employee.getName() + "deleted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		String action = request.getParameter("action");
		if (action != null) {
			switch (action) {
			case "delete":
				try {
					delete(request, response);
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				break;

			}
		}

	}

	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String Name = request.getParameter("Name");
		Connection connection = EmployeeRegistrationConnection.getConnection();
		try {
			String save = "delete from EmployeeDetails where Name=?";
			PreparedStatement ps = connection.prepareStatement(save);
			ps.setString(1, Name);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		doPost(request, response);

	}

}