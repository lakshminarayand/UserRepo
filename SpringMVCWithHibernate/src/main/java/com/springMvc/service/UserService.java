package com.springMvc.service;

import java.util.List;

import com.springMvc.model.User;

public interface UserService {
	public List<User> geListOfUsers();
	public void saveOrUpdate(User user);
	public void delete(User user);
	public User findUserById(int id);
	public boolean findUserByUsername(String Username, String Password);
}
