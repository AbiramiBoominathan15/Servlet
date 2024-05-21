package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.EmployeeRegistrationForm;
import com.util.EmployeeRegistrationConnection;

public class EmployeeImplements implements EmployeeDAO{
    public void registration(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException {
        Connection connection =EmployeeRegistrationConnection.getConnection();
        String registration = "insert into EmployeeDetails(Name, Mail_Id, PhoneNumber)values(?,?,?)";
        PreparedStatement ps = connection.prepareStatement(registration);
          // employee.setName(employee.getName());
         //System.out.println("Employee Name" + employee.getName());
            ps.setString(1, employee.getName());
          //  employee.setMail_Id(employee.getMail_Id());
          //  System.out.println("Employee Mail_Id" + employee.getMail_Id());
            ps.setString(2, employee.getMail_Id());
          //  employee.setPhoneNumber(employee.getPhoneNumber());
          //  System.out.println("Employee Mail_Id" + employee.getPhoneNumber());
            ps.setString(3, employee.getPhoneNumber());
int rows= ps.executeUpdate();
System.out.println(rows+"rowsinserted");

           
}
}
