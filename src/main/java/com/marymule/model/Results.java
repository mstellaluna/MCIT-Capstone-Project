package com.marymule.model;


/**
 * The Class Results.
 */
public class Results {
	
	/** The student id. */
	private int studentId;
	
	/** The course id. */
	private int courseId;
	
	/** The session. */
	private String session;
	
	/** The mark. */
	private int mark;
	
	
	/**
	 * Instantiates a new results.
	 *
	 * @param studentId the student id
	 * @param courseId the course id
	 * @param session the session
	 * @param mark the mark
	 */
	public Results(int studentId, int courseId, String session, int mark) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.session = session;
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
	 * Gets the session.
	 *
	 * @return the session
	 */
	public String getSession() {
		return session;
	}


	/**
	 * Sets the session.
	 *
	 * @param session the new session
	 */
	public void setSession(String session) {
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Results [studentId=" + studentId + ", courseId=" + courseId + ", session=" + session + ", mark=" + mark
				+ "]";
	}
	
	
	
	

}
