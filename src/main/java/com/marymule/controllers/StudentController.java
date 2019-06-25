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
	
	@RequestMapping(value = "/student_list")
	public String displayAllStudents() {
		return "displayAllStudents";
	}
	
	@RequestMapping(value = "/student_details")
	public String displayStudentDetails() {
		return "displayStudentDetails";
				
	}
	
	@RequestMapping(value = "/edit_student/{id}")
	public String editStudentDetails() {
		return "editStudent";
	}
}
