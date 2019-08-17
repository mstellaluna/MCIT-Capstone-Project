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

import com.marymule.forms.AssignTeacherToCourseForm;
import com.marymule.forms.RegisterStudentToCourseForm;
import com.marymule.model.Course;
import com.marymule.model.Student;
import com.marymule.model.Teacher;
import com.marymule.service.ClassScheduleService;
import com.marymule.service.CourseService;
import com.marymule.service.StudentService;
import com.marymule.service.TeacherService;


// TODO: Auto-generated Javadoc
/**
 * The Class CourseController.
 */
@Controller
@RequestMapping(value = "/course")
public class CourseController {
	
	/** The course service. */
	@Autowired
	private CourseService courseService;
	
	/** The student service. */
	@Autowired
	private StudentService studentService;
	
	/** The teacher service. */
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private ClassScheduleService classScheduleService;
	

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
	 * @param course the course
	 * @param bindingResult the binding result
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
		modelmap.addAttribute("studentList", courseService.getStudentsAssignedToCourse(id));
		modelmap.addAttribute("course", courseService.getCourseById(id));
		modelmap.addAttribute("teacherList", courseService.getTeachersAssignedToCourse(id));
		modelmap.addAttribute("resultsList", courseService.getCourseById(id).getResults());
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
	 * @param courseID the course ID
	 * @param modelmap the modelmap
	 * @return the string
	 */
	@GetMapping(value = "/course_details/{courseID}")
	  public String displayCourseDetailsPage(@PathVariable("courseID") int courseID, ModelMap modelmap) { 
		modelmap.addAttribute("studentList", courseService.getStudentsAssignedToCourse(courseID));
		modelmap.addAttribute("course", courseService.getCourseById(courseID));
		modelmap.addAttribute("teacherList", courseService.getTeachersAssignedToCourse(courseID));
		modelmap.addAttribute("resultsList", courseService.getCourseById(courseID).getResults());
	//	modelmap.addAttribute("classScheduleList", courseService.ge)
		return "courseDetails";
	
	}
	
	
	  /**
  	 * Display assign courseto student page.
  	 *
  	 * @param model the model
  	 * @return the string
  	 */
  	@GetMapping(value = "/course_add_student") 
	  public String displayAssignCoursetoStudentPage(Model model) {
		  List<Student> studentList = studentService.getAllStudents();
		  List<Course> courseList = courseService.getAllCourses();
		  
		  if(studentList.isEmpty()) {
			  model.addAttribute("emptyStudentList", "There are no students in the system. Please contact Student Admissions");
			  	if(courseList.isEmpty()) {
			  		model.addAttribute("emptyCourseList", "There are no courses in the system. Please contact the Program Administrator.");
			  	}
		  }
		  		
		  model.addAttribute("studentList", studentList);
		  model.addAttribute("courseList", courseList);
		  return "addStudentToCourse";
	  }
	  	  
	  /**
  	 * Register student to course.
  	 *
  	 * @param model the model
  	 * @param form the form
  	 * @param bindingResult the binding result
  	 * @return the string
  	 */
  	@PostMapping(value = "/registerStudentToCourse")
	  public String registerStudentToCourse(Model model, @ModelAttribute("registration") @Valid RegisterStudentToCourseForm form, BindingResult bindingResult) {

		  if(bindingResult.hasErrors()) {
			  model.addAttribute("form",form);
			  return "addStudentToCourse";
			  
		  }
		  courseService.registerStudent(form.getCourseId(), form.getStudentId());
		  model.addAttribute("successMessage", "Student was added successfully");
		  return "addStudentToCourse";
	  }

	  
	  /**
  	 * Display assign teacher to course page string.
  	 *
  	 * @param model the model
  	 * @return the string
  	 */
  	@GetMapping(value = "/course_add_teacher")
	  public String displayAssignTeacherToCoursePageString(Model model) {

		  List<Teacher> teacherList = teacherService.getAllTeachers();
		  List<Course> courseList = courseService.getAllCourses();
		  if(teacherList.isEmpty()) {
			  model.addAttribute("emptyTeacherList", "There are currently no teachers in the system. Please contact the Program Administrator.");
			  if (courseList.isEmpty()) {
				  model.addAttribute("emptyCourseList", "There are currently no courses in the system. Please contact the Program Administrator.");
			  }
		  }
		  model.addAttribute("teacherList", teacherList);
		  model.addAttribute("courseList", courseList);
		  return "addTeacherToCourse";
		  	  
	  }
	  
	  /**
  	 * Assign teacherto course.
  	 *
  	 * @param model the model
  	 * @param form the form
  	 * @param bindingResult the binding result
  	 * @return the string
  	 */
  	@PostMapping(value = "/assignTeachertoCourse")
	  public String assignTeachertoCourse(Model model, @ModelAttribute("registration") @Valid AssignTeacherToCourseForm form, BindingResult bindingResult) {
		  if (bindingResult.hasErrors()) {
			 model.addAttribute("form", form);
			 return "addTeacherToCourse";
		  }
		  
		  courseService.registerTeacher(form.getCourseId(), form.getTeacherId());
		  model.addAttribute("successMessage", "Teacher was added successfully");
		  return "addTeacherToCourse";
	  }
	
	  /**
  	 * Removes the student from course.
  	 *
  	 * @param courseID the course ID
  	 * @param studentID the student ID
  	 * @param model the model
  	 * @return the string
  	 */
  	@GetMapping(value = "/course_remove_student/{courseID}/{studentID}")
	  public String removeStudentFromCourse(@PathVariable("courseID") int courseID, @PathVariable("studentID") int studentID, Model model) {
		  if(courseService.unregisterStudent(courseID, studentID)){
			  model.addAttribute("successMessage", "Student was successfully removed from course.");
		  } else {
			  model.addAttribute("errorMessage", "Failed to remove student from course.");
		  }
		  courseService.unregisterStudent(courseID, studentID);
		  model.addAttribute("courseList", courseService.getAllCourses());
		  return "displayAllCourses";
	  }
	  


	/**
	 * Removes the teacher from course.
	 *
	 * @param courseID the course ID
	 * @param teacherID the teacher ID
	 * @param model the model
	 * @return the string
	 */
	@GetMapping(value = "/course_remove_teacher/{courseID}/{teacherID}")
		public String removeTeacherFromCourse(@PathVariable("courseID") int courseID, @PathVariable("teacherID") int teacherID, Model model) {
	  if(courseService.unregisterTeacher(courseID, teacherID)){
		  model.addAttribute("successMessage", "Teacher was successfully removed from course.");
	  } else {
		  model.addAttribute("errorMessage", "Failed to remove teacher from course.");
	  }
	  
	  courseService.unregisterTeacher(courseID, teacherID);
	  model.addAttribute("teacherList", teacherService.getAllTeachers());
	 return "displayAllTeachers";

}		


}
