package com.marymule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@RequestMapping(value="/payment_add")
	public String addPayment() {
		return "addPayment";
	}

}
