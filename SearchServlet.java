package com.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.EmployeeRegistrationForm;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeRegistrationForm employee = new EmployeeRegistrationForm();
	EmployeeImplements implement = new EmployeeImplements();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Name = request.getParameter("Name");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/test_db_15", "root",
					"root");
			PreparedStatement ps = connection.prepareStatement("select * from EmployeeDetails where Name=?");
			ps.setString(1, Name);
			out.print("<table width=75% border=1>");
			out.print("<caption>EmployeeDetails:</caption>");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			int totalColumn = rsmd.getColumnCount();
			out.print("<tr>");
			for (int i = 1; i <= totalColumn; i++) {
				out.print("<th>" + rsmd.getColumnName(i) + "</th>");
			}
			out.print("<tr>");
			while (rs.next()) {
				out.print("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
						+ "</td><td>" + rs.getString(4) + "</td></tr>");
			}
			out.print("</table>");
		} catch (Exception e) {
			out.print(e);
		}
        RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeRegistrationJSP.jsp");
        dispatcher.forward(request, response);


	}

}
