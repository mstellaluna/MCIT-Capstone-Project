package com.marymule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import com.marymule.model.Results;
import com.marymule.service.CourseService;
import com.marymule.service.ResultsService;
import com.marymule.service.StudentService;

@Controller
@RequestMapping(value = "/results")
public class ResultsController {
	
	
	/*
	 * @Autowired private ResultsService resultsService;
	 */
	  
	  @Autowired
	  private CourseService courseService;
	  
	  @Autowired
	  private StudentService studentService;
	

	@GetMapping(value = "/result_add")
	public String getAddResultsPage(Model model) {
		model.addAttribute("results", new Results());
		return "addResults";
	}
	
	@PostMapping(value = "/result_list")
	public String displayAllResults() {
		return "displayAllResults";
	}
	
	@GetMapping(value = "/edit_result/{result_id}")
	public String displayEditResultForm(@PathVariable("id") int id, ModelMap modelMap) {
		return "editResults";
	}
	
	@PostMapping(value = "updateResult")
	public String savedEditedResult(@ModelAttribute("result") Results results) {
			return "redirect:result_list";
	}

}
