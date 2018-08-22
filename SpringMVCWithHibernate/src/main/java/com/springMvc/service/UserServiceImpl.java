package com.springMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springMvc.dao.UserDao;
import com.springMvc.model.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
    private	UserDao userDao;

	public List<User> geListOfUsers() {
		return userDao.geListOfUsers();
	}

	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}

	public void delete(User user) {
		userDao.delete(user);
	}

	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

}
