package com.cg.emplDao;

import java.sql.SQLException;

import com.cg.empl.employee;
import com.cg.exceptions.EmployeeLoginException;
import com.cg.exceptions.InvalidDetailException;


public interface employeeService {

	public boolean login(employee e) throws SQLException,EmployeeLoginException;
	public boolean employeeExists(employee e) throws SQLException;
	public boolean changePassword(employee e) throws SQLException;
	public employee fetchOneConfidentialDetail(employee e) throws SQLException,InvalidDetailException;
	
	
}
