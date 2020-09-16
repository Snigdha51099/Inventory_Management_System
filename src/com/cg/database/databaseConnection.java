package com.cg.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
	
	public static Connection myConnection() throws SQLException{
		

			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","snigdha");
			
		    return connection;
		
	}
}
