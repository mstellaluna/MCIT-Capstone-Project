package com.marymule.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The Class Results.
 */
public class Results {
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
    @JoinColumn(name = "course_id")
	private Course course;
	
	/** The session. */
	private String session;
	
	/** The mark. */
	private int mark;
	
	

	public Results() { }

    public Results(Student student, Course course, String session, int mark) {
		super();
		this.student = student;
		this.course = course;
		this.session = session;
		this.mark = mark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Results [student=" + student + ", course=" + course + ", session=" + session + ", mark=" + mark + "]";
	}
	
    
	
	
	
	

}
