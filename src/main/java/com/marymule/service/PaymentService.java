package com.marymule.service;

import java.util.List;

import com.marymule.model.Payment;

public interface PaymentService {
	
	void insertPayment(Payment payment); 
	void updatePayment(Payment payment); 
	void deletePayment(int id); 
	Payment getPaymentById(int id);
	List<Payment> getAllPayments();
	List<Payment> getAllStudentPayments(int id);

}
