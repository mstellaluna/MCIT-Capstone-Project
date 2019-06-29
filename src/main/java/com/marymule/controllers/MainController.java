package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	 @RequestMapping(value="/")
	 public String getLoginPage() {
<<<<<<< HEAD
		 return "login";
	 }
	 
	 @RequestMapping(value={"/index", "/menu"})
	 public String getIndexPage() {
=======
>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c
		 return "index";

<<<<<<< HEAD
=======
}

>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c
}