package com.cg.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.RawMaterialOrder.RawMatrialOrderMainImp;
import com.cg.constants.employeeConstants;
import com.cg.empl.clearconsole;
import com.cg.empl.employee;
import com.cg.emplDao.employeeServiceImp;
import com.cg.exceptions.EmployeeLoginException;
import com.cg.exceptions.InvalidChoiceException;
import com.cg.exceptions.InvalidDetailException;

public class impl {
	static Connection connection;
	
	public static void main(String[] args) throws SQLException, IOException,EmployeeLoginException,InvalidDetailException,InvalidChoiceException 
 {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the choice \n1-Login \n2-Forgot Password \n3-Logout");
		String name,pass;
		employeeServiceImp eservice = new employeeServiceImp();
		int choice = scan.nextInt();
		

		employee e = new employee(null, null, null);
		while(true) {
		if (choice ==1) {
		    System.out.println("Enter the Username : ");
		    name = scan.next();
		    e.setEmpId(name);    
		    System.out.println("Enter Password :");
	    	pass= scan.next();
	    	e.setPassword(pass);
		    if (eservice.login(e)) {
		    	clearconsole.clearConsole();
			    System.out.print("Successfully loggedIn \n");
			    RawMatrialOrderMainImp r = new RawMatrialOrderMainImp();
			    r.function();
			    choice =3;
		    }
		    else {
		    	System.out.println(new EmployeeLoginException(employeeConstants.LOGIN_FAILED));	    	
		    }		    
		}
		
		else if(choice ==2) {
			System.out.println("Enter the Username :");
		    name = scan.next();
		    e.setEmpId(name);
			if (eservice.employeeExists(e)) {
				System.out.println("Enter the confidential detail");
				String name1= scan.next();
				e = eservice.fetchOneConfidentialDetail(e);
				if ((e.getEmpName().equals(name1)) && (eservice.changePassword(e))){
					choice =1;
				
				}
			else {
					System.out.println(new InvalidDetailException(employeeConstants.INVALID_DETAIL));		
				}
			}	
		}
		
		else if (choice == 3) {
			System.out.println("exit done successfully");
			break;
		         }
		
		else {
			System.out.println(new InvalidChoiceException(employeeConstants.INVALID_CHOICE));
			choice =3;
		     }
		}
		scan.close();
}
	}
