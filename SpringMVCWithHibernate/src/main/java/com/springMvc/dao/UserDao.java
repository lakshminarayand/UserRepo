package com.springMvc.dao;

import java.util.List;

import com.springMvc.model.User;

public interface UserDao {
	
	public List<User> geListOfUsers();
	public void saveOrUpdate(User user);
	public void delete(User user);
	public User findUserById(int id);
	public int findUser(String username, String password);
	
}
