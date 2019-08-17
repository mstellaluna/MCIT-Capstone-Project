package com.marymule.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * The Class Course.
 */
@Entity(name = "Course")
@Table(name = "courses")
public class Course implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** The course name. */
	@NotEmpty(message = "Course name is required")
	@Column(name = "courseName")
	private String courseName;

	/** The credit number. */
	@Min(value = 1, message = "Credit number must be greater than 1")
	@Max(value = 8, message = "Credit number must be less than 8")
	@Column(name = "creditNumber")
	private int creditNumber;

	/** The students registered. */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "student_in_course", joinColumns = { @JoinColumn(name = "course_id") }, inverseJoinColumns = {
			@JoinColumn(name = "student_id") })
	private Set<Student> studentsRegistered = new HashSet<>();

	/** The teachers registered. */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "teacher_assigned_course", joinColumns = {
			@JoinColumn(name = "course_id") }, inverseJoinColumns = { @JoinColumn(name = "teacher_id") })
	private Set<Teacher> teachersRegistered = new HashSet<>();

	/** The results. */
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "courseResult")
	private List<Results> results;

	/** The course schedule. */
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "scheduledCourses")
	private List<ClassSchedule> programSchedule;

	/**
	 * Instantiates a new course.
	 */
	public Course() {
	}

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
	 * Gets the course name.
	 *
	 * @return the course name
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * Sets the course name.
	 *
	 * @param courseName the new course name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * Gets the credit number.
	 *
	 * @return the credit number
	 */
	public int getCreditNumber() {
		return creditNumber;
	}

	/**
	 * Sets the credit number.
	 *
	 * @param creditNumber the new credit number
	 */
	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

	/**
	 * Gets the students registered.
	 *
	 * @return the students registered
	 */
	public Set<Student> getStudentsRegistered() {
		return studentsRegistered;
	}

	/**
	 * Sets the students registered.
	 *
	 * @param studentsRegistered the new students registered
	 */
	public void setStudentsRegistered(Set<Student> studentsRegistered) {
		this.studentsRegistered = studentsRegistered;
	}

	/**
	 * Gets the teachers registered.
	 *
	 * @return the teachers registered
	 */
	public Set<Teacher> getTeachersRegistered() {
		return teachersRegistered;
	}

	/**
	 * Sets the teachers registered.
	 *
	 * @param teachersRegistered the new teachers registered
	 */
	public void setTeachersRegistered(Set<Teacher> teachersRegistered) {
		this.teachersRegistered = teachersRegistered;
	}

	/**
	 * Gets the results.
	 *
	 * @return the results
	 */
	public List<Results> getResults() {
		return results;
	}

	/**
	 * Sets the results.
	 *
	 * @param results the new results
	 */
	public void setResults(List<Results> results) {
		this.results = results;
	}

	public List<ClassSchedule> getProgramSchedule() {
		return programSchedule;
	}

	public void setProgramSchedule(List<ClassSchedule> programSchedule) {
		this.programSchedule = programSchedule;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", creditNumber=" + creditNumber
				+ ", studentsRegistered=" + studentsRegistered + ", teachersRegistered=" + teachersRegistered
				+ ", results=" + results + ", programSchedule=" + programSchedule + "]";
	}

	/**
	 * Gets the course schedule.
	 *
	 * @return the course schedule
	 */


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */


	

}
