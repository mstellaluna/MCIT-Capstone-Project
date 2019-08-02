package com.marymule.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "Payment")
@Table(name = "payments")
public class Payment {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "amount")
	@Positive
	@NotNull
	private int amount;

	
	@Column(name = "paymentDate")
	@DateTimeFormat(pattern="(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])/(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])/(?:30))|(?:(?:0[13578]|1[02])-31))")
	@NotEmpty
	private Date paymentDate;

	 @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	    @JoinTable(name = "student_payments",
	            joinColumns = { @JoinColumn(name="payment_id") },
	            inverseJoinColumns = { @JoinColumn(name = "student_id") })
	    private Set<Student> studentPayments = new HashSet<>();

}

