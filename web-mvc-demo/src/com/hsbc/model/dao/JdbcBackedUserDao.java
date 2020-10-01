package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.util.DBUtility;

public class JdbcBackedUserDao implements UserDao{

	@Override
	public User authenticate(int userId, String password) throws AuthenticationException {
		User user = null;
		try {
			Connection connection = DBUtility.getConnection();
			String loginQuery = "select * from user_table where user_id=? and password=?";
			PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2 ,password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setName(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getLong("phone"));
				return user;
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(user == null) {
				throw new AuthenticationException("Sorry, invalid credentials");
			}
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User storeUser(User user) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for user_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
			int seq = 0;
			if(rs.next()) {
				seq = rs.getInt(1);
			} 
			if(seq == 0) {
				System.out.println("user_seq error");
			} 
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user_table values(?,?,?,?)");
			preparedStatement.setInt(1, seq);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter name");
			preparedStatement.setString(2, scanner.next());
			System.out.println("Enter password");
			preparedStatement.setString(3, scanner.next());
			System.out.println("Enter phone");
			preparedStatement.setLong(4, scanner.nextLong());
			preparedStatement.executeUpdate();
			System.out.println("User created with an id = "+seq);
			preparedStatement.close();
			connection.close();
			scanner.close();
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<User> fetchAll() {
		ArrayList<User> userList = new ArrayList<User>();
		User user;
		try {
			Connection connection = DBUtility.getConnection();
			String fetchAll = "select * from user_table";
			PreparedStatement prepadredStatement = connection.prepareStatement(fetchAll);
			ResultSet resultSet = prepadredStatement.executeQuery();
			while(resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setName(resultSet.getString("name")); 
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getLong("phone"));
				userList.add(user);
			}
		resultSet.close();
		prepadredStatement.close();
		connection.close();
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public User getUser(int userId) throws UserNotFoundException {
		User user = null;
		try {
			Connection connection = DBUtility.getConnection();
			String fetchQuery = "select * from user_table where user_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(fetchQuery);
			preparedStatement.setInt(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setName(resultSet.getString("name")); 
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getLong("phone"));
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(user == null) {
				throw new UserNotFoundException("Sorry, invalid userId");
			}
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User updateUser(int userId, User user) throws UserNotFoundException {
		User user1 = null;
		
		return user1;
	}

}
