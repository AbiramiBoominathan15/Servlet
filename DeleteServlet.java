package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.EmployeeRegistrationForm;

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
		String Name = request.getParameter("delete");
		employee.setName(Name);

		try {
			implement.deleteEmployeeData(Name);
			PrintWriter writer = response.getWriter();
			writer.println(employee.getName() + " deleted");
			List<EmployeeRegistrationForm> list = implement.read1EmployeeData();
			request.setAttribute("list", list);

			request.getRequestDispatcher("EmployeeRegistrationJSP.jsp").forward(request, response);

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
		doGet(request, response);
//		String Name = request.getParameter("Name");
//		employee.setName(Name);
//
//		try {
//			implement.deleteEmployeeData(Name);
//			PrintWriter writer = response.getWriter();
//			writer.println(employee.getName() + "deleted");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		String action = request.getParameter("action");
//		if (action != null) {
//			switch (action) {
//			case "delete":
//				try {
//					delete(request, response);
//				} catch (ClassNotFoundException | SQLException e) {
//					e.printStackTrace();
//				}
//				break;
//			}
	}
}

//	public void delete(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, ClassNotFoundException, SQLException {
//		String Name = request.getParameter("Name");
//		Connection connection = EmployeeRegistrationConnection.getConnection();
//		try {
//			String save = "delete from EmployeeDetails where Name=?";
//			PreparedStatement ps = connection.prepareStatement(save);
//			ps.setString(1, Name);
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		doPost(request, response);
//	}
//}
