package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.model.EmployeeRegistrationForm;
import com.model.UserLogin;
import com.util.EmployeeRegistrationConnection;

public class UserLoginDAO {
	public void insert(UserLogin user) throws ClassNotFoundException, SQLException {
		Connection connection = EmployeeRegistrationConnection.getConnection();
		String insert = "insert into UserDetails(UserName,UserPassword)values(?,?)";
		PreparedStatement ps = connection.prepareStatement(insert);
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getUserPassword());
		int rows = ps.executeUpdate();
		System.out.println(rows + "rowsinserted");
		connection.close();
		ps.close();

	}
	public List<UserLogin> read() throws ClassNotFoundException, SQLException {
		List<UserLogin> users = new ArrayList<>();
		Connection connection = EmployeeRegistrationConnection.getConnection();
		String updateEmployeeData = "select * from UserDetails";
		PreparedStatement ps = connection.prepareStatement(updateEmployeeData);
		try {
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String UserName = rs.getString("UserName");
				String UserPassword = rs.getString("UserPassword");
				users.add(new UserLogin(UserName, UserPassword));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
}