package com.kulchuri.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeDb implements DbData {
	static Connection conn = null;
	static {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PWD);
			System.out.println("Connection Established");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getEmployeeDb() {
		return conn;
	}

	public static void main(String[] args) {
		System.out.println(getEmployeeDb());
	}
}
