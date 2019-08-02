package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marymule.model.Payment;

@Controller
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@RequestMapping(value="/payment_add")
	public String addPayment(Model model) {
		model.addAttribute("payment", new Payment());
		return "addPayment";
	}

}
