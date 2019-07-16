package com.marymule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

// TODO: Auto-generated Javadoc
/**
 * The Class Course.
 */
@Entity
@Table(name="courses")
public class Course {
	
	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/** The course name. */
	@Column(name="courseName")
	private String courseName;
	
	/** The credit number. */
	@Min(value = 1)
	@Max(value = 8)
	@Column(name="creditNumber")
	private int creditNumber;

	/**
	 * Instantiates a new course.
	 */
	public Course() { }

	/**
	 * Instantiates a new course.
	 *
	 * @param id the id
	 * @param courseName the course name
	 * @param creditNumber the credit number
	 */
	public Course(int id, String courseName, @Min(1) @Max(8) int creditNumber) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.creditNumber = creditNumber;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", creditNumber=" + creditNumber + "]";
	}

	
	
	
	
	

}
