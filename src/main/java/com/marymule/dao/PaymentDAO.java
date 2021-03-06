package com.marymule.dao;

import java.util.List;
import java.util.Set;

import com.marymule.model.Payment;
import com.marymule.model.Student;

public interface PaymentDAO {
	
	void insertPayment(Payment payment); 
	Payment updatePayment(Payment payment); 
	void deletePayment(int id); 
	Payment getPaymentById(int id);
	List<Payment> getAllPayments();
	List<Payment> getAllStudentPayments(int id);

}
