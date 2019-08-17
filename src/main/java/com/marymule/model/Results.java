package com.marymule.model;

import javax.persistence.*;
import javax.validation.constraints.*;



/**
 * The Class Results.
 */

@Entity(name = "Results")
@Table(name = "results")
public class Results {

	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** The session. */
	@NotNull(message = "Session must be between 101 and 1299.")
	@Min(101)
	@Max(1299)
	@Column(name = "session")
	private int session;

	/** The mark. */
	@NotNull(message = "Mark must be between 0 and 20.")
	@Min(0)
	@Max(20)
	@Column(name = "mark")
	private int mark;

	/** The student id. */
	@Transient
	private int studentId;
	
	/** The course id. */
	@Transient
	private int courseId;

	/** The student result. */
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "student_id", updatable = true, nullable = false)
	private Student studentResult;

	/** The course result. */
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "course_id", updatable = true, nullable = false)
	private Course courseResult;

	/**
	 * Instantiates a new results.
	 */
	public Results() {
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
	 * Gets the session.
	 *
	 * @return the session
	 */
	public int getSession() {
		return session;
	}

	/**
	 * Sets the session.
	 *
	 * @param session the new session
	 */
	public void setSession(int session) {
		this.session = session;
	}

	/**
	 * Gets the mark.
	 *
	 * @return the mark
	 */
	public int getMark() {
		return mark;
	}

	/**
	 * Sets the mark.
	 *
	 * @param mark the new mark
	 */
	public void setMark(int mark) {
		this.mark = mark;
	}

	/**
	 * Gets the student id.
	 *
	 * @return the student id
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * Sets the student id.
	 *
	 * @param studentId the new student id
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * Gets the course id.
	 *
	 * @return the course id
	 */
	public int getCourseId() {
		return courseId;
	}

	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	/**
	 * Gets the student result.
	 *
	 * @return the student result
	 */
	public Student getStudentResult() {
		return studentResult;
	}

	/**
	 * Sets the student result.
	 *
	 * @param studentResult the new student result
	 */
	public void setStudentResult(Student studentResult) {
		this.studentResult = studentResult;
	}

	/**
	 * Gets the course result.
	 *
	 * @return the course result
	 */
	public Course getCourseResult() {
		return courseResult;
	}

	/**
	 * Sets the course result.
	 *
	 * @param courseResult the new course result
	 */
	public void setCourseResult(Course courseResult) {
		this.courseResult = courseResult;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Results [id=" + id + ", session=" + session + ", mark=" + mark + ", studentId=" + studentId
				+ ", courseId=" + courseId + ", getId()=" + getId() + ", getSession()=" + getSession() + ", getMark()="
				+ getMark() + ", getStudentId()=" + getStudentId() + ", getCourseId()=" + getCourseId()
				+ ", getStudentResult()=" + getStudentResult() + ", getCourseResult()=" + getCourseResult()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
