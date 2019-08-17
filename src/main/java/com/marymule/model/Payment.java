package com.marymule.model;

import java.util.Date;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * The Class Payment.
 */
@Entity
@Table(name = "payment")
public class Payment {

	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** The amount. */
	@Column(name = "amount")
	@Min(0)
	@NotNull
	private int amount;

	/** The payment date. */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "paymentDate")
	private Date paymentDate;

	/** The student payments. */
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "student_id", updatable = true, nullable = false)
	private Student studentPayments;

	/** The student ID. */
	@Transient
	private int studentID;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * Gets the payment date.
	 *
	 * @return the payment date
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * Sets the payment date.
	 *
	 * @param paymentDate the new payment date
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * Gets the student payments.
	 *
	 * @return the student payments
	 */
	public Student getStudentPayments() {
		return studentPayments;
	}

	/**
	 * Sets the student payments.
	 *
	 * @param studentPayments the new student payments
	 */
	public void setStudentPayments(Student studentPayments) {
		this.studentPayments = studentPayments;
	}

	/**
	 * Gets the student ID.
	 *
	 * @return the student ID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * Sets the student ID.
	 *
	 * @param studentID the new student ID
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payment [id=" + id + ", studentID=" + studentID + ", amount=" + amount + ", paymentDate=" + paymentDate
				+ ", studentPayments=" + studentPayments + ", getId()=" + getId() + ", getAmount()=" + getAmount()
				+ ", getStudentPayments()=" + getStudentPayments() + ", getStudentID()=" + getStudentID()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
