package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {

	// connection - open, close
	// query/statement

	// url, username, password
	public static final String URL = "jdbc:mysql://localhost:3306/drinks";
	public static final String USER = "root";
	public static final String PASS = "root";

	private Connection conn;
	private PreparedStatement pstmt;
	private Statement stmt;

	// open up the connection, passing in the credentials
	public Sql() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			this.stmt = conn.createStatement();// create a statement object to execute sql queries
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// NEED: a way to run queries - do CRUD
	// create - INSERT INTO ... - executeUpdate

	// USING STATEMENT
//	public void create(String name, Double units) {
//		String insert = "INSERT INTO alcohol(`name`,units) VALUES('" + name + "','" + units + "');";
//		try {
//			stmt.executeUpdate(insert);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // executeUpdate - make changes to the database, put data into the database
//
//	}

	// USING PREPARED STATEMENT
	public void create(String name, Double units) {
		String insert = "INSERT INTO alcohol(`name`,units) VALUES(?,?);";
		try {
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, name);
			pstmt.setDouble(2, units);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// read - SELECT ... - executeQuery
	public void read() {
		String read = "SELECT * FROM alcohol;";
		ResultSet rs;

		try {
			rs = stmt.executeQuery(read);
			while (rs.next()) {
				System.out.println("ID:" + rs.getInt("id") + ", NAME: " + rs.getString("name") + ", UNITS: "
						+ rs.getDouble("units"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// read - SELECT ... - executeQuery
	public void readById(int id) {
		String readById = "SELECT * FROM alcohol WHERE id=" + id + ";";
		ResultSet rs;

		try {
			rs = stmt.executeQuery(readById);
			while (rs.next()) {
				System.out.println("ID:" + rs.getInt("id") + ", NAME: " + rs.getString("name") + ", UNITS: "
						+ rs.getDouble("units"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update - UPDATE ... - executeUpdate

	// delete - DELETE ... - executeUpdate

	// close the connection
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
