package com.hsbc.model.service;

import java.util.ArrayList;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;

public interface UserService {
	
	public User login(int userId, String password) throws AuthenticationException;
	public User createUser(User user);
	public User updatePhone(int userId, long phone) throws UserNotFoundException;
	public User updatePassword(int userId, String password) throws UserNotFoundException;
	public User getUser(int userId) throws UserNotFoundException;
	public ArrayList<User> getAllUsers();
}
