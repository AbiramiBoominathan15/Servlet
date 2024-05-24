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

//	public void delete(String Name) throws ClassNotFoundException, SQLException {
//		Connection connection = EmployeeRegistrationConnection.getConnection();
//		String save = "delete from EmployeeDetails where Name=?";
//		PreparedStatement ps = connection.prepareStatement(save);
//		int rows = ps.executeUpdate();
//		System.out.println(rows + "deleted");
//	}
	// Read
	public List<EmployeeRegistrationForm> read1EmployeeData() throws ClassNotFoundException, SQLException {
		List<EmployeeRegistrationForm> users = new ArrayList<>();
		Connection connection = EmployeeRegistrationConnection.getConnection();
		String updateEmployeeData = "select * from EmployeeDetails";
		PreparedStatement ps = connection.prepareStatement(updateEmployeeData);
		try {
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String Name = rs.getString("Name");
				String Password = rs.getString("Password");
				String Mail_Id = rs.getString("Mail_Id");
				String PhoneNumber = rs.getString("PhoneNumber");
				users.add(new EmployeeRegistrationForm(Name, Password, Mail_Id, PhoneNumber));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	// Read end
	public void update(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException {
		String save = " UPDATE EmployeeDetails SET Password=?, Mail_Id = ?, PhoneNumber=? WHERE Name = ?";
		try (Connection connection = EmployeeRegistrationConnection.getConnection();
				PreparedStatement p = connection.prepareStatement(save);) {
			p.setString(1, employee.getPassword());
			p.setString(2, employee.getMail_Id());
			p.setString(3, employee.getPhoneNumber());
			p.setString(4, employee.getName());
			int rows = p.executeUpdate();
			System.out.println(rows + "rows updated");
			p.close();
			connection.close();
		}
	}
	public boolean deleteEmployeeData(String Name) throws ClassNotFoundException, SQLException {
		boolean rowDeleted;
		String deleteEmployeeData = "delete from EmployeeDetails where Name=?";
		try (Connection connection = EmployeeRegistrationConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(deleteEmployeeData);) {
			ps.setString(1, Name);
			rowDeleted = ps.executeUpdate() > 0;
			ps.close();
			connection.close();
		}
		return rowDeleted;
	}
}
  