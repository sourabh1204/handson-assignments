package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;

public interface UserDao {
	public User authenticate(int userId, String password) throws AuthenticationException;
	public User storeUser(User user);
	public ArrayList<User> fetchAll();
	public User getUser(int userId) throws UserNotFoundException;
	public User updateUser(int userId, User user) throws UserNotFoundException;
}
