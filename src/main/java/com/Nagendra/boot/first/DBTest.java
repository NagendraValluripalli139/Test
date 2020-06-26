package com.Nagendra.boot.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		String connectionUrl = "jdbc:sqlserver://IN2162918W1\\SQLEXPRESS:1433;databaseName=Employee_Database;integratedSecurity=true";

		try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
			String SQL = "SELECT TOP 10 * FROM Employees;";
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				System.out.println(rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
