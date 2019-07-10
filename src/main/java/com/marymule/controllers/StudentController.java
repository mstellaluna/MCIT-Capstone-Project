package com.marymule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
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

	@RequestMapping(value = "/student_list")
	public String displayAllStudents() {
		 return "displayAllStudents";
	}
    
	/*
	@RequestMapping(value = "/student_add", method = RequestMethod.GET)
	public ModelAndView getStudentForm() {
		ModelAndView model = new ModelAndView("addStudent");
		return model;
	}
	
	@RequestMapping(value = "/submitStudentForm", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student) {
				studentService.insertStudent(student);
				return "redirect:/student_list";
	}

	@RequestMapping(value = "/student_list")
	public ModelAndView displayAllStudents() {
		ModelAndView model = new ModelAndView("displayAllStudents");
		return model;
	}

	@RequestMapping(value = "/student_details/{id}")
	public String displayStudentDetails() {
		return "displayStudentDetails";

	}

	@RequestMapping(value = "/edit_student/{id}")
	public String editStudentDetails() {
		return "editStudent";
	}

	
	 * @RequestMapping(value = "/student_add") public String addStudent() { return
	 * "addStudent"; }
	 * 
	 * @RequestMapping(value = "/student_list") public String displayAllStudents() {
	 * return "displayAllStudents"; }
	 * 
	 * @RequestMapping(value = "/student_details") public String
	 * displayStudentDetails() { return "displayStudentDetails";
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/edit_student/{id}") public String
	 * editStudentDetails() { return "editStudent"; }
	 */
}
