package com.marymule.daoImpl;

import java.util.List;

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
		return em.merge(payment);
	}

	@Override
	public void deletePayment(int id) {
		Payment entity = em.find(Payment.class, id);
		em.remove(entity);
		
	}

	@Override
	public Payment getPaymentById(int id) {
		return em.find(Payment.class, id);
	}

	@Override
	public List<Payment> getAllPayments() {
		return em.createQuery("SELECT p FROM Payment p", Payment.class).getResultList();
	}

	@Override
	public List<Payment> getAllStudentPayments(int id) {
		Student entity = em.find(Student.class, id);
		return entity.getPayments();

	}

	
	
}
