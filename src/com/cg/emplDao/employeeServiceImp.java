package com.cg.emplDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.database.databaseConnection;
import com.cg.empl.employee;
import com.cg.exceptions.EmployeeLoginException;
import com.cg.exceptions.InvalidDetailException;

public class employeeServiceImp implements employeeService 
{  
	

	@Override
	public boolean login(employee e) throws SQLException,EmployeeLoginException {
		// TODO Auto-generated method stub
		if (employeeExists(e)) 
		{
			Connection connection = databaseConnection.myConnection();
			PreparedStatement prepared = connection.prepareStatement("Select password from Employee where empId = ?");
			prepared.setString(1,e.getEmpId());
			ResultSet resultSet = prepared.executeQuery();
			while((  resultSet != null ) && (resultSet.next())) {
				if (resultSet.getString(1).equals(e.getPassword()))
					return true;
				else
					return false;     }
			
			return false;
		}
		else {
			
			return false;
			}
	}

	@Override
	public boolean employeeExists(employee e) throws SQLException {
		// TODO Auto-generated method stub
		String  id = e.getEmpId();
		Connection connection = databaseConnection.myConnection();
		PreparedStatement prepared = connection.prepareStatement("Select empId from Employee where empId = ?");
		prepared.setString(1, id);
		ResultSet resultset= prepared.executeQuery();
		if((  resultset != null ) && (resultset.next())){
			return true;
		}
		return false;
	}

	@Override
	public boolean changePassword(employee e) throws SQLException {
		// TODO Auto-generated method stub
	 if (employeeExists(e)) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the new password");
		 String pass= scan.next();
		 	Connection connection = databaseConnection.myConnection();
			PreparedStatement prepared = connection.prepareStatement("UPDATE Employee SET password= ? WHERE empId = ?");
			prepared.setString(1, pass);
			prepared.setString(2, e.getEmpId());
			if (prepared.executeUpdate() >0) {
				//connection.commit();
				e.setPassword(pass);
				return true;
			}
			else {
				return false;
			}
		 
	 }
		
		return false;
	}

	@Override
	public employee fetchOneConfidentialDetail(employee e) throws SQLException,InvalidDetailException  {
	
			if (employeeExists(e)) {
				Connection connection = databaseConnection.myConnection();
				PreparedStatement prepared = connection.prepareStatement("select empName  from Employee where empId = ? ");
				prepared.setString(1, e.getEmpId());
				ResultSet resultset = prepared.executeQuery();      
				if((  resultset != null ) && (resultset.next())){
					e.setEmpName(resultset.getString(1));
					return e;
				}
				return e;
			}
			return e;
	}

}
