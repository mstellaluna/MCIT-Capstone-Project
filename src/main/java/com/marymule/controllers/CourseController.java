package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/course")
public class CourseController {

	@RequestMapping(value = "/course_add")
	public String addCourse() {
		return "addCourse";
	}
}
