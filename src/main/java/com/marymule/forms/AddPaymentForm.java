package com.marymule.forms;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.marymule.model.Payment;
import com.marymule.model.Student;

public class AddPaymentForm {
	
	@NotNull
	private int id;
	
	@NotNull 
	private int studentId;
		
	/** The session. */
	@NotNull(message = "Payment amount cannot be empty.")
	@Column(name = "amount")
	private int amount;
	
	/** The mark. */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "paymentDate")
	private Date paymentDate;
	
	private Iterable<Payment> payments;
	
	
	 private Student student;
	 


	public AddPaymentForm() { }



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}


	


	public Date getPaymentDate() {
		return paymentDate;
	}



	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}



	public Iterable<Payment> getPayments() {
		return payments;
	}



	public void setPayments(Iterable<Payment> payments) {
		this.payments = payments;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	@Override
	public String toString() {
		return "AddPaymentForm [id=" + id + ", studentId=" + studentId + ", amount=" + amount + ", paymentDate="
				+ paymentDate + ", payments=" + payments + ", student=" + student + "]";
	}
	
	

	


	



	

	
	
	







	

	
}
