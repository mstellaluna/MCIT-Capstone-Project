package com.marymule.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.PaymentDAO;
import com.marymule.model.Payment;
import com.marymule.model.Student;
import com.marymule.service.PaymentService;
import com.marymule.service.StudentService;

@Service
@org.springframework.transaction.annotation.Transactional
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private PaymentDAO paymentDAO;

	@Override
	public void insertPayment(Payment payment) {
		payment.setStudentPayments(studentService.getStudentById(payment.getStudentID()));
		paymentDAO.insertPayment(payment);
		
	}

	@Override
	public void updatePayment(Payment payment) {
		paymentDAO.updatePayment(payment);
	}

	@Override
	public void deletePayment(int id) {
		paymentDAO.deletePayment(id);
		
	}

	@Override
	public Payment getPaymentById(int id) {
		return paymentDAO.getPaymentById(id);
	}

	@Override
	public List<Payment> getAllPayments() {
			return paymentDAO.getAllPayments();
	}

	@Override
	public List<Payment> getAllStudentPayments(int id) {
			return paymentDAO.getAllStudentPayments(id);
			
	}

	
}
