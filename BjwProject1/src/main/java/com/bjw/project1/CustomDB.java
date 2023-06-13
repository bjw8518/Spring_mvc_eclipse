package com.bjw.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.sqlite.SQLiteConfig;

public class CustomDB {
	private Connection connection;

//////////////
//insertData//
//////////////
	public void insertData(String id, String pwd, String name, String phone, String sex, String address) {
		// db open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection(
					"jdbc:sqlite:/C:\\db\\u.sqlite", config.toProperties());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// db insert query
//		String query = "INSERT INTO user (id, pwd, name, phone, sex, address) VALUES("
//				+ "'" + id + "'" + "," + "'" + pwd + "'" + "," + "'"
//				+ phone + "'" + "," + "'" + sex + "'" + "," + "'" + address + "'" + ")";
		String query = "INSERT INTO user (id, pwd, name, phone, sex, address) VALUES(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement statement = this.connection.prepareStatement(query);
			statement.setString(1, id);
			statement.setString(2, pwd);
			statement.setString(3, name);
			statement.setString(4, phone);
			statement.setString(5, sex);
			statement.setString(6, address);
			statement.execute();
			statement.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		// db close
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//////////////
//insertData//
//////////////
	
	
//////////
//update//
//////////

	//1. db open
	
	//2. query
		
	//1. db close
	
	
//////////
//update//
//////////

	
	
//////////
//delete//
//////////

//1. db open

//2. query
	
//1. db close


//////////
//delete//
//////////
	
	
//////////////
////create////
//////////////	
	public void create() {
		// db open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection(
					"jdbc:sqlite:/C:\\db\\u.sqlite", config.toProperties());
		} catch (Exception e) {
			e.printStackTrace();
		}

		String query = "CREATE TABLE user(idx INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "id TEXT, pwd TEXT, name TEXT, phone TEXT, sex TEXT, address TEXT)";
		try {
//			Statement statement = this.connection.createStatement();
//			statement.executeQuery(query);
//			statement.close();
			PreparedStatement statement = this.connection.prepareStatement(query);
			statement.execute();
			statement.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}		
		
		// db close
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//////////////
////create////
//////////////	
	
//////////////
////select////
//////////////
	public ArrayList<User> select() {
		ArrayList<User> result = new ArrayList<User>();
		// db open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection(
					"jdbc:sqlite:/C:\\db\\u.sqlite", config.toProperties());
		} catch (Exception e) {
			e.printStackTrace();
		}

		String query = "SELECT * FROM user WHERE idx=?";
		try {
			PreparedStatement statement = this.connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				String id = resultSet.getString("id");
				String pwd = resultSet.getString("pwd");
				String name = resultSet.getString("name");
				String phone = resultSet.getString("phone");
				String sex = resultSet.getString("sex");
				String address = resultSet.getString("address");
				String joined = resultSet.getString("joined");
				String type = resultSet.getString("type");
				int idx = resultSet.getInt("idx");
				result.add(new User(idx, id, pwd, name, phone, sex, address, joined, type));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		// db close
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
//////////////
////select////
//////////////


	
	
	
///////////////////
////detailsData////
///////////////////
	// db open
//	try {
//		Class.forName("org.sqlite.JDBC");
//		SQLiteConfig config = new SQLiteConfig();
//		this.connection = DriverManager.getConnection(
//				"jdbc:sqlite:/C:\\db\\u.sqlite", config.toProperties());
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
	public User detailsData(User user, String id, String pwd) {
		
		return null;
	}
///////////////////
////detailsData////
///////////////////
	
}

