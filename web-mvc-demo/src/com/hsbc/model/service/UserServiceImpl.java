package com.hsbc.model.service;

import java.util.ArrayList;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.util.FactoryPattern;
import com.hsbc.model.util.Type;

public class UserServiceImpl implements UserService {

	private UserDao dao=null;
	
	public UserServiceImpl() {
		dao = (UserDao) FactoryPattern.getInstacnce(Type.DAO);
	}
	
	@Override
	public User login(int userId, String password) throws AuthenticationException {
		User user = dao.authenticate(userId, password);
		if(user == null) {
			throw new AuthenticationException("Sorry, invalid credentials");
		}
		return user;
	}

	@Override
	public User createUser(User user) {
		dao.storeUser(user);
		return user;
	}

	@Override
	public User getUser(int userId) throws UserNotFoundException {
		User user = null;
		user = dao.getUser(userId);
		return user;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		return dao.fetchAll();
	}
	@Override
	public User updatePhone(int userId, long phone) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User updatePassword(int userId, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
