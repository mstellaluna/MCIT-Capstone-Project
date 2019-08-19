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
import org.springframework.web.bind.annotation.RequestParam;

import com.marymule.model.Course;
import com.marymule.model.Teacher;
import com.marymule.service.CourseService;
import com.marymule.service.TeacherService;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	
	@RequestMapping(value="/teacher_add")
	public String getAddTeacherForm(ModelMap modelMap) {
		modelMap.addAttribute("teacher", new Teacher());
		return "addTeacher";
	}
	
	@PostMapping(value="/addTeacher")
	public String addTeacher(@Valid Teacher teacher, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "addTeacher";
		}
		
		teacherService.insertTeacher(teacher);
		return "redirect:teacher_list";
	}
	
	@GetMapping(value="/teacher_list")
	public String displayAllTeachers(Model model) {
		List<Teacher> teacherList = teacherService.getAllTeachers();
		if(teacherList.isEmpty()) {
			model.addAttribute("emptyTeacherList", "There are no teachers in the system. Please contact Program Administrator");
		}
		model.addAttribute("teacherList", teacherList);
		return "displayAllTeachers";
	}
	
	@GetMapping(value = "/edit_teacher/{id}")
	public String displayEditTeacherForm(@PathVariable("id") int id, Model model) {
		Set<Course> courseList = teacherService.getTeachersAssignedCourses(id);
			if(courseList.isEmpty()) {
				model.addAttribute("emptyCourseList", "No courses have been assigned. Please contact Program Administrator");
			}
			
		model.addAttribute("teacher", teacherService.getTeacherById(id));
		model.addAttribute("courseList", courseList);
		return "editTeacher";
	}
	
	@PostMapping(value="/updateTeacher")
	public String saveEditedTeacher(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.updateTeacher(teacher);
		return "redirect:teacher_list";
	}
	
	@GetMapping(value="/delete_teacher/{id}")
	public String deleteTeacher(@PathVariable("id") int id, Model model) {
		teacherService.deleteTeacher(id);
		model.addAttribute("teacherList", teacherService.getAllTeachers());
		return "displayAllTeachers";
	}
	
	@GetMapping(value="/teacher_details/{id}")
	public String displayTeacherDetailsPage(@PathVariable("id") int id, Model model) {
		Set<Course> courseList = teacherService.getTeachersAssignedCourses(id);
			if (courseList.isEmpty()) {
				model.addAttribute("emptyCourseList", "No courses have been assigned. Please contact the Program Administrator.");
			}
		model.addAttribute("teacher", teacherService.getTeacherById(id));
		model.addAttribute("courseList", courseList);
		return "teacherDetails";
		
	}

}
