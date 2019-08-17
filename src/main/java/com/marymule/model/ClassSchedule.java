package com.marymule.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "classSchedule")
public class ClassSchedule {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/** The mark. */
	@DateTimeFormat(pattern = "HH:mm")
	@Temporal(TemporalType.TIME)
	@Column(name = "startTime")
	private Date startTime;
	
	/** The mark. */
	@DateTimeFormat(pattern = "HH:mm")
	@Temporal(TemporalType.TIME)
	@Column(name = "endTime")
	private Date endTime;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "classDate")
	private Date classDate;
	

	 @Transient
	 private int courseID;
	 
	 @Transient
	  private int locationID;
	
	
	 @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	 @JoinColumn(name = "course_id",updatable=true,nullable=false)
	 private Course scheduledCourses;
	

	 @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	 @JoinColumn(name = "location_id",updatable=true,nullable=false)
	 private Locations scheduledLocations;


	public ClassSchedule() { }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getCourseID() {
		return courseID;
	}


	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}


	public int getLocationID() {
		return locationID;
	}


	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}


	public Course getScheduledCourses() {
		return scheduledCourses;
	}


	public void setScheduledCourses(Course scheduledCourses) {
		this.scheduledCourses = scheduledCourses;
	}


	public Locations getScheduledLocations() {
		return scheduledLocations;
	}


	public void setScheduledLocations(Locations scheduledLocations) {
		this.scheduledLocations = scheduledLocations;
	}


	public Date getClassDate() {
		return classDate;
	}


	public void setClassDate(Date classDate) {
		this.classDate = classDate;
	}


	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", classDate="
				+ classDate + ", courseID=" + courseID + ", locationID=" + locationID + ", scheduledCourses="
				+ scheduledCourses + ", scheduledLocations=" + scheduledLocations + "]";
	}
	
	


	
	 
}
