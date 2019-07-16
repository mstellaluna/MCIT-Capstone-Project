package com.marymule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marymule.model.Student;
import com.marymule.service.StudentService;

// TODO: Auto-generated Javadoc
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
	 * @param studentService the new student service
	 * 
	 */
	
	/**
	 * Gets the student form.
	 *
	 * @param model the model
	 * @return the student form
	 */
	@GetMapping(value = "/student_add")
	public String getStudentForm(ModelMap model) {
		model.addAttribute("student", new Student());
		return "addStudent";
	}
	
	/**
	 * Adds the student.
	 *
	 * @param model the model
	 * @param student the student
	 * @return the string
	 */
	@PostMapping(value = "/addStudent")
	public String addStudent(ModelMap model, Student student) {
				studentService.insertStudent(student);
				return "redirect:student_list";
	}

	/**
	 * Display all students.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping(value = "/student_list")
	public String displayAllStudents(Model model) {
		model.addAttribute("studentList", studentService.getAllStudents());
		 return "displayAllStudents";
	}
	
	/**
	 * Gets the student by id.
	 *
	 * @param id the id
	 * @param model the model
	 * @param student the student
	 * @return the student by id
	 */
	
	@GetMapping(value = "/edit_student/{id}")
	  public String displayEditStudentForm(@PathVariable("id") int id, ModelMap modelmap) { 
		modelmap.addAttribute("student", studentService.getStudentById(id));
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
	 * Gets the student details.
	 *
	 * @param id the id
	 * @param model the model
	 * @param student the student
	 * @return the student details
	 */
	
	@GetMapping( value = "/studentDetails")
	public String getStudentDetails(@PathVariable("id") int id, Model model) {
		 model.addAttribute("student", studentService.getStudentById(id));
		 return "redirect:studentDetails";
	}
	

	
	/**
	 * Delete student.
	 *
	 * @param id the id
	 * @return the string
	 */
	
	@GetMapping(value = "/delete_student")
	public String deleteStudent(@RequestParam("id") int id) {
			studentService.deleteStudent(id);
			return "redirect:student_list";
	}
	

}
