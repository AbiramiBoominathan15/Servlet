package com.DAO;

import java.sql.SQLException;

import com.model.EmployeeRegistrationForm;

public interface EmployeeDAO {
	public void registration(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException;

//	 public void registration1(EmployeeRegistrationForm employee)throws
//	 ClassNotFoundException, SQLException;
	public void delete(EmployeeRegistrationForm employee) throws ClassNotFoundException, SQLException;

}
