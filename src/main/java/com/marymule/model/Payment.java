package com.marymule.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
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
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	@NotEmpty
	private Date paymentDate;
}
