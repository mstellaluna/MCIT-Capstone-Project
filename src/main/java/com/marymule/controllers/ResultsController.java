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

import com.marymule.forms.AddResultsForm;
import com.marymule.model.Course;
import com.marymule.model.Results;
import com.marymule.model.Student;
import com.marymule.service.CourseService;
import com.marymule.service.ResultsService;
import com.marymule.service.StudentService;

@Controller
@RequestMapping(value = "/results")
public class ResultsController {
	
	
	
	  @Autowired 
	  private ResultsService resultsService;
	  
	  @Autowired
	  private CourseService courseService;
	  
	  @Autowired
	  private StudentService studentService;
	

	@GetMapping(value = "/results_add")
	public String getAddResultsPage(Model model) {
		
		List<Course> courseList = courseService.getAllCourses();
		List<Student> studentList = studentService.getAllStudents();
		if (courseList.isEmpty()) {
			model.addAttribute("emptyCourseList", "There are currently no courses in the system. Please contact Program Administrator");
			if(studentList.isEmpty()) {
				model.addAttribute("emptyStudentList", "There are currently no students in the system. Please contact Student Admissions.");
			}
		}
		model.addAttribute("results", new Results());
		model.addAttribute("studentList", studentList);
		model.addAttribute("courseList", courseList);
		return "addResults";
	}
	
	@PostMapping(value = "/addResults")
	public String saveStudentResults(@ModelAttribute("results") @Valid AddResultsForm form, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "displayAllResults";
		}
	
		Results results = new Results();
		results.setCourseId(form.getCourseId());
		results.setStudentId(form.getStudentId());
		results.setSession(form.getSession());
		results.setMark(form.getMark());
		resultsService.insertResult(results);
		return "redirect:results_list";
	}

	
	@GetMapping(value = "/results_list")
	public String displayAllResults(Model model) {
		List<Results> resultsList = resultsService.getAllResults();
		model.addAttribute("resultsList", resultsList);
		return "displayAllResults";
		
	}
	
	@GetMapping(value = "/edit_results/{id}")
	public String displayEditResultForm(@PathVariable("id") int id, ModelMap modelMap) {
		List<Course> courseList = courseService.getAllCourses();
		List<Student> studentList = studentService.getAllStudents();
		if (courseList.isEmpty()) {
			modelMap.addAttribute("emptyCourseList", "There are currently no courses in the system. Please contact Program Administrator");
			if(studentList.isEmpty()) {
				modelMap.addAttribute("emptyStudentList", "There are currently no students in the system. Please contact Student Admissions.");
			}
		}

		modelMap.addAttribute("studentList", studentList);
		modelMap.addAttribute("courseList", courseList);
		return "editResults";
	}
	
	@PostMapping(value = "/updateResults")
	public String savedEditedResult(@ModelAttribute("results") @Valid Results results, Model model, BindingResult bindingResult) {
		resultsService.updateResults(results);
		model.addAttribute("resultsList", resultsService.getAllResults());
			return "displayAllResults";
	}
	
	@GetMapping(value = "/delete_results")
	public String deleteResults(@RequestParam("id") int id, Model model) {
			resultsService.deleteResults(id);
			return "redirect:results_list";
	}

}
