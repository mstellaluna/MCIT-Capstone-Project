package com.marymule.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marymule.forms.AddPaymentForm;
import com.marymule.model.Payment;
import com.marymule.model.Student;
import com.marymule.service.PaymentService;
import com.marymule.service.StudentService;

@Controller
@RequestMapping(value = "/payment")
public class PaymentController {
	
	  @Autowired
	  private PaymentService paymentService;
	  
	  @Autowired
	  private StudentService studentService;
	  
	
	@GetMapping(value="/payment_add")
	public String getAddPaymentPage(Model model) {
		List<Student> studentList = studentService.getAllStudents();
			if(studentList.isEmpty()) {
				model.addAttribute("emptyStudentList", "There are no students in the system. Please contact Student Admissions");
			}
		model.addAttribute("payment", new Payment());
		model.addAttribute("studentList", studentList);
		return "addPayment";
	}
		
	  @PostMapping(value = "/addPayment") 
	  public String saveStudentPayment(@ModelAttribute("payment") @DateTimeFormat(pattern="yyyy-MM-dd") @Valid AddPaymentForm form, Model model, BindingResult bindingResult) {
	  
	  Payment payment = new Payment(); 
	  payment.setAmount(form.getAmount());
	  payment.setPaymentDate(form.getPaymentDate());
	  payment.setStudentID(form.getStudentId());
	  paymentService.insertPayment(payment); 
	  model.addAttribute("paymentList", paymentService.getAllPayments());  
	  return "displayAllPayments";
	 }
	  
	  @GetMapping(value = "/payment_list")
	  public String displayAllPayments(Model model) {
		  List<Payment> paymentList = paymentService.getAllPayments();
		  	if(paymentList.isEmpty()) {
		  		model.addAttribute("emptyPaymentList", "There are no payments in the system. Please contact Student Admissions");
		  	}
	        model.addAttribute("paymentList", paymentList);    
	        return "displayAllPayments";
	  }
	  
	  @GetMapping(value = "/edit_payment/{id}")
	  public String getEditPaymentForm(@PathVariable("id") int id, Model model) {
		  List<Student> studentList = studentService.getAllStudents();
		   if(studentList.isEmpty()) {
			   model.addAttribute("emptyStudentList", "There are no students in the system. Please contact Student Admissions");
		   }
		  model.addAttribute("studentList", studentList);
		  return "editPayments";
	 }
	  
	  @PostMapping(value = "/updatePayment")
	  public String saveEditedPayment(@ModelAttribute("payment") @Valid Payment payment, Model model, BindingResult bindingResult) {
		  paymentService.updatePayment(payment);
		  model.addAttribute("paymentList", paymentService.getAllPayments());
		  return "displayAllPayments";
	  }
	  
	  @GetMapping(value = "/delete_payment")
	  public String deletePayment(@RequestParam("id") int id, Model model) {
		  paymentService.deletePayment(id);
		  return "displayAllPayments";
	  }
	

}

