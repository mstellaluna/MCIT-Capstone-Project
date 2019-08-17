package com.marymule.forms;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.marymule.model.ClassSchedule;
import com.marymule.model.Course;
import com.marymule.model.Locations;

public class AddScheduleForm {
	
	@NotNull
	private int id;
	
	@NotNull 
	private int courseId;
	
	@NotNull
	private int locationId;
		
	
	@DateTimeFormat(pattern = "HH:mm")
	@Temporal(TemporalType.TIME)
	@Column(name = "startTime")
	private Date startTime;
	
	
	@DateTimeFormat(pattern = "HH:mm")
	@Temporal(TemporalType.TIME)
	@Column(name = "endTime")
	private Date endTime;
	

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "classDate")
	private Date classDate;
	
	
	
	
	private Iterable<ClassSchedule> schedules;
	
	
	 private Course course;
	 private Locations locations;
	 


	public AddScheduleForm() { }



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public int getLocationId() {
		return locationId;
	}



	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}



	public Date getStartTime() {
		return startTime;
	}



	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



	public Date getEndTime() {
		return endTime;
	}



	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	public Date getClassDate() {
		return classDate;
	}



	public void setClassDate(Date classDate) {
		this.classDate = classDate;
	}



	public Iterable<ClassSchedule> getSchedules() {
		return schedules;
	}



	public void setSchedules(Iterable<ClassSchedule> schedules) {
		this.schedules = schedules;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public Locations getLocations() {
		return locations;
	}



	public void setLocations(Locations locations) {
		this.locations = locations;
	}



	




	
	
	

	


	



	

	
	
	







	

	
}
