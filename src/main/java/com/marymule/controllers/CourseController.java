package com.marymule.controllers;

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

import com.marymule.model.Course;
import com.marymule.service.CourseService;


/**
 * The Class CourseController.
 */
@Controller
@RequestMapping(value = "/course")
public class CourseController {
	
	/** The course service. */
	@Autowired
	private CourseService courseService;

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
	public String addCourse(@Valid Course course, BindingResult result) {
			
			if (result.hasErrors()) {
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
}
