package com.hsbc.model.utility;

import com.hsbc.model.business.ServiceLayerImpl;
import com.hsbc.model.dao.JdbcBackedDao;

public class FactoryPattern {
	
	public static Object getInstance(LayerType type) {
		Object obj = null;
		switch(type) {
		case SERVICE : obj = new ServiceLayerImpl();
			break;
		case DAO : obj = new JdbcBackedDao();
			break;
		}
		return obj;
	}
}
