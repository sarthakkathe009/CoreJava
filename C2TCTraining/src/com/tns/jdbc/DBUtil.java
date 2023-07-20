package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static Connection cn;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1909");
		}
		catch(Exception e){
			System.err.println("Error!!"+e.getMessage());
		}
		
	}
	public static Connection getConnection() {
		return cn;
	}
}
