package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	 @RequestMapping(value="/")
	 public String getLoginPage() {
		 return "login";
	 }
	 
	 @RequestMapping(value={"/index", "/menu"})
	 public String getIndexPage() {
		 return "index";
	 }

}