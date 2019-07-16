package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {

	
	@RequestMapping(value = "/teacher_add")
	public String addTeachers() {
		return "addTeacher";
	}
}
