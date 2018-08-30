package com.springMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springMvc.model.User;
import com.springMvc.service.UserService;

@RestController
@RequestMapping("secure")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getuser/", method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<User> getUsers(){
		return userService.geListOfUsers();
	}
	
	@RequestMapping(value="/adduser/", method=RequestMethod.POST,headers="Accept=application/text")
	public @ResponseBody User addUser(@RequestBody User user) {
		System.out.println("jjjjjjjjjjjj");
		userService.saveOrUpdate(user);
		return user;
	}
	
	@RequestMapping(value="/updateuser/{id}", method=RequestMethod.PUT,headers="Accept=application/json;odata=verbose")
	public @ResponseBody User update(@PathVariable("id") int id, @RequestBody User user) {
		user.setId(id);
		userService.saveOrUpdate(user);
		return user;
	}
	
	@RequestMapping(value="/deleteuser/{id}", method=RequestMethod.DELETE,headers="Accept=application/json")
	public @ResponseBody User deleteUser(@PathVariable("id") int id) {
		User user = userService.findUserById(id);
		userService.delete(user);
		return user;
	}
	
	@RequestMapping(value="/finduser/{id}", method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody User findUserById(@PathVariable("id") int id) {
		User user = userService.findUserById(id);
		return user;
	}

}
