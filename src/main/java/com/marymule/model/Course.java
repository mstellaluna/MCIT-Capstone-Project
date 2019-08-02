package com.marymule.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The Class Course.
 */
@Entity(name = "Course")
@Table(name="courses")
public class Course implements Serializable{
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/** The course name. */
	@NotEmpty(message = "Course name is required")
	@Column(name="courseName")
	private String courseName;
	
	/** The credit number. */
	@Min(value = 1, message = "Credit number must be greater than 1")
	@Max(value = 8, message = "Credit number must be less than 8")
	@Column(name="creditNumber")
	private int creditNumber;

	 @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	    @JoinTable(name = "student_in_course",
	            joinColumns = { @JoinColumn(name="course_id") },
	            inverseJoinColumns = { @JoinColumn(name = "student_id") })
	    private Set<Student> studentsRegistered = new HashSet<>();
	 
	 
	 @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	    @JoinTable(name = "teacher_assigned_course",
	            joinColumns = { @JoinColumn(name="course_id") },
	            inverseJoinColumns = { @JoinColumn(name = "teacher_id") })
	    private Set<Teacher> teachersRegistered = new HashSet<>();
	
	    @OneToMany(mappedBy = "courseResult")
	    private List<Results> results = new ArrayList<>();

	/**
	 * Instantiates a new course.
	 */
	public Course() { }


	public Course(int id, String courseName,
			@Min(value = 1, message = "Credit number must be greater than 1") @Max(value = 8, message = "Credit number must be less than 8") int creditNumber) {
		this.id = id;
		this.courseName = courseName;
		this.creditNumber = creditNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getCreditNumber() {
		return creditNumber;
	}


	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}


	public Set<Student> getStudentsRegistered() {
		return studentsRegistered;
	}


	public void setStudentsRegistered(Set<Student> studentsRegistered) {
		this.studentsRegistered = studentsRegistered;
	}


	public Set<Teacher> getTeachersRegistered() {
		return teachersRegistered;
	}


	public void setTeachersRegistered(Set<Teacher> teachersRegistered) {
		this.teachersRegistered = teachersRegistered;
	}


	public List<Results> getResults() {
		return results;
	}


	public void setResults(List<Results> results) {
		this.results = results;
	}


	

	
	




}
