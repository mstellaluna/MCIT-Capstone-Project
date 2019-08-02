package com.marymule.daoImpl;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marymule.dao.PaymentDAO;
import com.marymule.model.Payment;
import com.marymule.model.Student;

@Repository
public class PaymentDAOImpl implements PaymentDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertPayment(Payment payment) {
		em.persist(payment);
		
	}

	@Override
	public Payment updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePayment(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment getPaymentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Student> getAllStudentPayments(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
