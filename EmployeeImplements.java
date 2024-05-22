package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.EmployeeRegistrationForm;
import com.util.EmployeeRegistrationConnection;

public class EmployeeImplements implements EmployeeDAO {
	public void registration(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException {
		Connection connection = EmployeeRegistrationConnection.getConnection();
		String registration = "insert into EmployeeDetails(Name,Password, Mail_Id, PhoneNumber)values(?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(registration);
		ps.setString(1, employee.getName());
		ps.setString(2, employee.getPassword());
		ps.setString(3, employee.getMail_Id());
		ps.setString(4, employee.getPhoneNumber());
		int rows = ps.executeUpdate();
		System.out.println(rows + "rowsinserted");
		connection.close();
		ps.close();
	}

	public void delete(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException {
		Connection connection = EmployeeRegistrationConnection.getConnection();
		String save = "delete from EmployeeDetails where Name='Ramya' ";
		PreparedStatement ps = connection.prepareStatement(save);
		int rows = ps.executeUpdate();
		System.out.println(rows + "deleted");
	}
//
//	public void registration1(String Mail_Id) throws ClassNotFoundException, SQLException {
//		Connection connection = EmployeeRegistrationConnection.getConnection();
//		System.out.println(connection);
//		String updateQuery = "UPDATE EmployeeDetails SET Mail_Id = 'abiramiboominathan15@gmail.com' WHERE Name = 'abirami' AND Password='abirami@12'";
//		PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
//		int rowsUpdated = preparedStatement.executeUpdate();
//		System.out.println(rowsUpdated + " rows updated");
//		connection.close();
//		preparedStatement.close();
//	}
//
//	public List<EmployeeRegistrationForm> read1EmployeeData() throws ClassNotFoundException, SQLException {
//		List<EmployeeRegistrationForm> users = new ArrayList<>();
//		Connection connection = EmployeeRegistrationConnection.getConnection();
//		String updateEmployeeData = "update EmployeeDetails set Name=?,Mail_Id=?,PhoneNumber=?,Password=? where Name=?";
//		PreparedStatement ps = connection.prepareStatement(updateEmployeeData);
//		try {
//			System.out.println(ps);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				String Name = rs.getString("Name");
//				String Password = rs.getString("Password");
//				String Mail_Id = rs.getString("Mail_Id");
//				String PhoneNumber = rs.getString("PhoneNumber");
//				users.add(new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return users;
//	}
//
//	public static final String readEmployeeData = "select Name, Mail_Id,PhoneNumber,Password from EmployeeDetails where Name=?";
//	public static final String read1EmployeeData = "select * from EmployeeDetails";
//	public static final String deleteEmployeeData = "delete from EmployeeDetails where Name=?";
//	public static final String updateEmployeeData = "update EmployeeDetails set Name=?,Mail_Id=?,PhoneNumber=?,Password=? where Name=?";

//
//	public boolean updateEmployeeData(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException {
//		boolean rowUpdated;
//		try (Connection connection = EmployeeRegistrationConnection.getConnection();
//				PreparedStatement ps = connection.prepareStatement(updateEmployeeData);) {
//			ps.setString(1, employee.getName());
//			ps.setString(2, employee.getPassword());
//			ps.setString(3, employee.getMail_Id());
//			ps.setString(4, employee.getPhoneNumber());
//
//			rowUpdated = ps.executeUpdate() > 0;
//			ps.close();
//			connection.close();
//		}
//		return rowUpdated;
//	}
//
//	public EmployeeRegistrationForm readEmployeeData(String Name) throws ClassNotFoundException {
//
//		EmployeeRegistrationForm employee = null;
//		try (Connection connection = EmployeeRegistrationConnection.getConnection();
//				PreparedStatement ps = connection.prepareStatement(updateEmployeeData);) {
//			ps.setString(1, Name);
//			System.out.println(ps);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				String Password = rs.getString("Password");
//				String Mail_Id = rs.getString("Mail_Id");
//				String PhoneNumber = rs.getString("PhoneNumber");
//				employee = new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return employee;
//	}
//
//	public List<EmployeeRegistrationForm> read1EmployeeData() throws ClassNotFoundException {
//		List<EmployeeRegistrationForm> users = new ArrayList<>();
//		try (Connection connection = EmployeeRegistrationConnection.getConnection();
//				PreparedStatement ps = connection.prepareStatement(updateEmployeeData);) {
//			System.out.println(ps);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				String Name = rs.getString("Name");
//				String Password = rs.getString("Password");
//				String Mail_Id = rs.getString("Mail_Id");
//				String PhoneNumber = rs.getString("PhoneNumber");
//				users.add(new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return users;
//	}
//
//	public boolean deleteEmployeeData(String Name) throws ClassNotFoundException, SQLException {
//		boolean rowDeleted;
//		try (Connection connection = EmployeeRegistrationConnection.getConnection();
//				PreparedStatement ps = connection.prepareStatement(deleteEmployeeData);) {
//			ps.setString(1, Name);
//
//			rowDeleted = ps.executeUpdate() > 0;
//			ps.close();
//			connection.close();
//		}
//		return rowDeleted;
//	}
//
//	@Override
//	public void deleteEmployeeData(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//		
//	}
//
}
