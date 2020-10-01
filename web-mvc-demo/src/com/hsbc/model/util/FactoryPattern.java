package com.hsbc.model.util;

import com.hsbc.model.dao.JdbcBackedUserDao;
import com.hsbc.model.service.UserServiceImpl;

public class FactoryPattern {
	public static Object getInstacnce(Type type) {
		Object obj = null;
		
		switch(type) {
		case DAO : obj = new JdbcBackedUserDao();
		break;
		case SERVICE : obj = new UserServiceImpl();
		break;
		}
		
		return obj;
		
	}
}
