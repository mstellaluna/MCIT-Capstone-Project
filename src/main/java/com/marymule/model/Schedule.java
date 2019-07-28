package com.marymule.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "schedules")
public class Schedule {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "startHour")
	@Min(0)
	@Max(23)
	private int startHour;
	
	@Column(name = "endHour")
	@Min(0)
	@Max(23)
	private int endHour;
	
	@Column(name = "startMinutes")
	@Min(0)
	@Max(59)
	private int startMinutes;
	
	@Column(name = "endMinutes")
	@Min(0)
	@Max(23)
	private int endMinutes;
	
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date scheduledDate;
}
