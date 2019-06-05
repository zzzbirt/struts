package com.gucci.service;

import java.sql.SQLException;

import com.gucci.dao.UserDao;
import com.gucci.domain.User;

public class UserService {

	public boolean findUser(User user) throws SQLException {
		UserDao userDao = new UserDao();
		User temp = userDao.findUser(user);
		return temp == null?false:true;
	}

}
