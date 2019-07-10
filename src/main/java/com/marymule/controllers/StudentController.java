package com.marymule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marymule.model.Student;
import com.marymule.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    private StudentService studentService;

	@Autowired(required = true)
    @Qualifier(value = "studentService")
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }	
	
	@RequestMapping(value = "/student_add", method = RequestMethod.GET)
	public String getStudentForm(ModelMap model) {
		model.addAttribute("student", new Student());
		return "addStudent";
	}
	
	@RequestMapping(value = "/submitStudentForm", method = RequestMethod.POST)
	public String addStudent(ModelMap model, Student student) {
				studentService.insertStudent(student);
				return "redirect:student_list";
	}

	@RequestMapping(value = "/student_list", method = RequestMethod.GET)
	public String displayAllStudents(Model model) {
		model.addAttribute("studentList", studentService.getAllStudents());
		 return "displayAllStudents";
	}
}
