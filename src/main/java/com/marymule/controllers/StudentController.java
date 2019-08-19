package com.marymule.controllers;

import java.awt.geom.Area;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marymule.model.Course;
import com.marymule.model.Payment;
import com.marymule.model.Results;
import com.marymule.model.Student;
import com.marymule.service.StudentService;




/**
 * The Class StudentController.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    /** The student service. */
	@Autowired
    private StudentService studentService;



	/**
	 * Sets the student service.
	 *
	 * @param modelMap the model map
	 * @return the adds the student form
	 */
	
	/**
	 * Gets the student form.
	 *
	 * @param model the model
	 * @return the student form
	 */
	@GetMapping(value = "/student_add")
	public String getAddStudentForm(ModelMap modelMap) {
		modelMap.addAttribute("student", new Student());
		return "addStudent";
	}
	
	/**
	 * Adds the student.
	 *
	 * @param student the student
	 * @param bindingResult the binding result
	 * @return the string
	 */
	
	@PostMapping(value = "/addStudent")
	public String addStudent(@Valid Student student, Model model, BindingResult bindingResult) {
			
			if(bindingResult.hasErrors()) {
				return "addStudent";
			} 
			
			else {
		
				studentService.insertStudent(student);
				model.addAttribute("studentList", studentService.getAllStudents());
				return "displayAllStudents";
			}	
	}

	/**
	 * Display all students.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping(value = "/student_list")
	public String displayAllStudents(Model model) {
		
		List<Student> studentList = studentService.getAllStudents();
		if(studentList.isEmpty()) {
			model.addAttribute("emptyStudentList", "There are currently no students in the system. Please contact Student Admissions.");
		}
		model.addAttribute("studentList", studentService.getAllStudents());
		 return "displayAllStudents";
	}
	
	/**
	 * Gets the student by id.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the student by id
	 */
	
	@GetMapping(value = "/edit_student/{id}")
	  public String displayEditStudentForm(@PathVariable("id") int id, Model model) { 
		Set<Course> courseList = studentService.getStudentsRegisteredCourses(id);
		List<Results> resultsList = studentService.getStudentById(id).getResults();
		List<Payment> paymentList = studentService.getPaymentByStudentId(id);
		if(courseList.isEmpty()) {
			model.addAttribute("emptyCourseList", "The student is not enrolled in any courses. Please contact Student Admissions.");
			if(resultsList.isEmpty()) {
				model.addAttribute("emptyResultsList", "There are no results for the student. Please contact assigned teacher.");
				if(paymentList.isEmpty()) {
					model.addAttribute("emptyPaymentList", "There are no payments for the student. Please contact Program Administrator.");
				}
			}
		}
		
		model.addAttribute("student", studentService.getStudentById(id));
		model.addAttribute("courseList", courseList);
		model.addAttribute("resultsList", resultsList);
		model.addAttribute("paymentList", paymentList);
		return "editStudent";
	
	}
	

	
	/**
	 * Update student.
	 *
	 * @param student the student
	 * @return the string
	*/
	
	@PostMapping(value = "/updateStudent")
	public String savedEditedStudent(@ModelAttribute("student") Student student, Model model) {
		List<Student> studentList = studentService.getAllStudents();
		if(studentList.isEmpty()) {
			model.addAttribute("emptyStudentList", "There are no students in the system. Please contact Student Admissions");
		}
			studentService.updateStudent(student);
			model.addAttribute("studentList", studentList);
			return "displayAllStudents";
	}
	
	/**
	 * Delete student.
	 *
	 * @param id the id
	 * @return the string
	 */
	
	@GetMapping(value = "/delete_student/{id}")
	public String deleteStudent(@PathVariable("id") int id, Model model) {
		List<Student> studentList = studentService.getAllStudents();
			if(studentList.isEmpty()) {
				model.addAttribute("emptyStudentList", "There are no students in the system. Please contact Student Admissions");
			}
			studentService.deleteStudent(id);
			model.addAttribute("studentList", studentService.getAllStudents());
			return "displayAllStudents";
	}
	
	/**
	 * Gets the student details.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the student details
	 */
	
	@GetMapping(value = "/student_details/{id}")
	  public String displayStudentDetailsPage(@PathVariable("id") int id, Model model) { 
		Set<Course> courseList = studentService.getStudentsRegisteredCourses(id);
		List<Results> resultsList = studentService.getStudentById(id).getResults();
		List<Payment> paymentList = studentService.getPaymentByStudentId(id);
		if(courseList.isEmpty()) {
			model.addAttribute("emptyCourseList", "The student is not enrolled in any courses. Please contact Student Admissions.");
			if(resultsList.isEmpty()) {
				model.addAttribute("emptyResultsList", "There are no results for the student. Please contact assigned teacher.");
				if(paymentList.isEmpty()) {
					model.addAttribute("emptyPaymentList", "There are no payments for the student. Please contact Program Administrator.");
				}
			}
		}
		
		model.addAttribute("student", studentService.getStudentById(id));
		model.addAttribute("courseList", courseList);
		model.addAttribute("resultsList", resultsList);
		model.addAttribute("paymentList", paymentList);
		return "studentDetails";
	
	}


}
