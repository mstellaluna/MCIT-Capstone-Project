package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@RequestMapping(value = "/student_add")
	public String addStudent() {
		return "addStudent";
	}
}
