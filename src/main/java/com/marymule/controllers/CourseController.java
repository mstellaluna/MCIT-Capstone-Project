package com.marymule.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.marymule.forms.AssignTeachertoCourseForm;
import com.marymule.forms.RegisterStudentToCourseForm;
import com.marymule.model.Course;
import com.marymule.model.Student;
import com.marymule.model.Teacher;
import com.marymule.service.CourseService;
import com.marymule.service.StudentService;
import com.marymule.service.TeacherService;


/**
 * The Class CourseController.
 */
@Controller
@RequestMapping(value = "/course")
public class CourseController {
	
	/** The course service. */
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeacherService teacherService;
	

	/**
	 * Gets the adds the course form.
	 *
	 * @param modelMap the model map
	 * @return the adds the course form
	 */
	@RequestMapping(value = "/course_add")
	public String getAddCourseForm(ModelMap modelMap) {
		modelMap.addAttribute("course", new Course());
		return "addCourse";
	}
	
	/**
	 * Adds the course.
	 *
	 * @param model the model
	 * @param course the course
	 * @return the string
	 */
	@PostMapping(value = "/addCourse")
	public String addCourse(@Valid Course course, BindingResult bindingResult) {
			
			if (bindingResult.hasErrors()) {
				return "addCourse";
			}
		
			courseService.insertCourse(course);
			return "redirect:course_list";
			
	}
	
	/**
	 * Display all courses.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping(value = "/course_list")
	public String displayAllCourses(Model model) {
		
		model.addAttribute("courseList", courseService.getAllCourses());
		 return "displayAllCourses";
	}
	
	/**
	 * Display edit course form.
	 *
	 * @param id the id
	 * @param modelmap the modelmap
	 * @return the string
	 */
	@GetMapping(value = "/edit_course/{id}")
	  public String displayEditCourseForm(@PathVariable("id") int id, ModelMap modelmap) { 
		modelmap.addAttribute("course", courseService.getCourseById(id));
		return "editCourse";
	
	}
	
	/**
	 * Saved edited course.
	 *
	 * @param course the course
	 * @return the string
	 */
	@PostMapping(value = "/updateCourse")
	public String savedEditedCourse(@ModelAttribute("course") Course course) {
			courseService.updateCourse(course);
			return "redirect:course_list";
	}
	
	/**
	 * Delete course.
	 *
	 * @param id the id
	 * @return the string
	 */
	@GetMapping(value = "/delete_course")
	public String deleteCourse(@RequestParam("id") int id) {
			courseService.deleteCourse(id);
			return "redirect:course_list";
	}
	
	/**
	 * Display course details page.
	 *
	 * @param id the id
	 * @param modelmap the modelmap
	 * @return the string
	 */
	@GetMapping(value = "/course_details/{id}")
	  public String displayCourseDetailsPage(@PathVariable("id") int id, ModelMap modelmap) { 
		modelmap.addAttribute("student", courseService.getCourseById(id));
		return "courseDetails";
	
	}
	
	/**
	 * Display edit course from course details.
	 *
	 * @param id the id
	 * @param modelmap the modelmap
	 * @return the string
	 */
	@GetMapping(value = "/course_details/edit_course/{id}")
	  public String displayEditCourseFromCourseDetails(@PathVariable("id") int id, ModelMap modelmap) { 
		modelmap.addAttribute("course", courseService.getCourseById(id));
		return "courseDetails";
	
	}
	
	
	  @GetMapping(value = "/course_add_student") 
	  public String displayAssignCoursetoStudentPage(Model model) {

		  List<Student> studentList = studentService.getAllStudents();
		  List<Course> courseList = courseService.getAllCourses();
		  		
		  model.addAttribute("studentList", studentList);
		  model.addAttribute("courseList", courseList);
		  return "addStudentToCourse";
	  }
	  	  
	  @PostMapping(value = "/registerStudentToCourse")
	  public String registerStudentToCourse(Model model, @ModelAttribute("registration") @Valid RegisterStudentToCourseForm form, BindingResult bindingResult) {

		  if(bindingResult.hasErrors()) {
			  model.addAttribute("form",form);
			  return "addStudentToCourse";
			  
		  }
		  courseService.registerStudent(form.getCourseId(), form.getStudentId());	
		  return "addStudentToCourse";
	  }

	  
	  @GetMapping(value = "/course_add_teacher")
	  public String displayAssignTeacherToCoursePageString(Model model) {
		 
		  List<Teacher> teacherList = teacherService.getAllTeachers();
		  List<Course> courseList = courseService.getAllCourses();
		  
		  model.addAttribute("teacherList", teacherList);
		  model.addAttribute("courseList", courseList);
		  return "addTeacherToCourse";
		  	  
	  }
	  
	  @PostMapping(value = "/assignTeachertoCourse")
	  public String assignTeachertoCourse(Model model, @ModelAttribute("registration") @Valid AssignTeachertoCourseForm form, BindingResult bindingResult) {
		  if (bindingResult.hasErrors()) {
			 model.addAttribute("form", form);
			 return "addTeacherToCourse";
		  }
		  
		  courseService.registerTeacher(form.getCourseId(), form.getTeacherId());
		  model.addAttribute("message", "Teacher was added successfully");
		  return "addTeacherToCourse";
	  }
	

}
