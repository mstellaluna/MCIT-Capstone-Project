package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/results")
public class ResultsController {

	@RequestMapping(value = "/add_results")
	public String addResults() {
		return "addResults";
	}
}
