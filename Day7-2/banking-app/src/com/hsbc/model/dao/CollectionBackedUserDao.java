package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.User;

public class CollectionBackedUserDao implements UserDao {
	
	// create a ArrayList with List reference
	private List<User> list = new ArrayList<User>();

	@Override
	public User store(User user) {
		// TODO Auto-generated method stub
		list.add(user);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		// TODO Auto-generated method stub
		User[] userArray = list.toArray(new User[list.size()]);
		return userArray;
	}

	@Override
	public User fetchUserById(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		for(User item : list) {
			if(item.getUserId() == userId) {
				user = item;
				return user;
			}
		}
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUserId() == userId) {
				list.set(i,user);
				break;
			}
		}
		return user;
	}

}