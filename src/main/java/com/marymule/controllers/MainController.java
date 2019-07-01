package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
	 
	 @RequestMapping(value={"/","/index", "/menu"})
	 public String getIndexPage(ModelMap model) {
		 return "index";
	 }

}