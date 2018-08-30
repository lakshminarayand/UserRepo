package com.springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springMvc.model.User;
import com.springMvc.service.UserService;

@Controller
@RequestMapping("ui")
class UIController {

	@Autowired 
	private UserService userService;
	@RequestMapping(value="/add/", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") User user) {
		userService.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("details");
		mv.addObject("user",user);
		return mv;
		
	}

}
