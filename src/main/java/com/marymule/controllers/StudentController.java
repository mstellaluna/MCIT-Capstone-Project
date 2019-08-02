package com.marymule.controllers;

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
	public String addStudent(@Valid Student student, BindingResult bindingResult) {
			
			if(bindingResult.hasErrors()) {
				return "addStudent";
			} 
			
			else {
		
				studentService.insertStudent(student);
				return "redirect:student_list";
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
		if(courseList.isEmpty()) {
			model.addAttribute("emptyCourseList", "The student is not enrolled in any courses. Please see Student Admissions.");
		}
		
		model.addAttribute("student", studentService.getStudentById(id));
		model.addAttribute("courseList", courseList);
		return "editStudent";
	
	}
	

	
	/**
	 * Update student.
	 *
	 * @param student the student
	 * @return the string
	*/
	
	@PostMapping(value = "/updateStudent")
	public String savedEditedStudent(@ModelAttribute("student") Student student) {
			studentService.updateStudent(student);
			return "redirect:student_list";
	}
	
	/**
	 * Delete student.
	 *
	 * @param id the id
	 * @return the string
	 */
	
	@GetMapping(value = "/delete_student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
			studentService.deleteStudent(id);
			return "student_list";
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
		if(courseList.isEmpty()) {
			model.addAttribute("emptyCourseList", " The student is not enrolled in any courses. Please see Student Admissions.");
		}
		model.addAttribute("student", studentService.getStudentById(id));
		model.addAttribute("courseList", courseList);
		return "studentDetails";
	
	}


}
