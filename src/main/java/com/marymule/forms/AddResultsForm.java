package com.marymule.forms;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.marymule.model.Course;
import com.marymule.model.Results;
import com.marymule.model.Student;
import com.marymule.model.Teacher;

public class AddResultsForm {
	
	@NotNull 
	private int studentId;
	
	@NotNull
	private int courseId;
	
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
	
	private Iterable<Results> results;
	
	private Course course;
	private Student student;


	public AddResultsForm() { }



	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public int getSession() {
		return session;
	}


	public void setSession(int session) {
		this.session = session;
	}


	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}


	public Iterable<Results> getResults() {
		return results;
	}


	public void setResults(Iterable<Results> results) {
		this.results = results;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "AddResultsForm [studentId=" + studentId + ", courseId=" + courseId + ", session=" + session + ", mark="
				+ mark + ", results=" + results + ", course=" + course + ", student=" + student + "]";
	}
	
	
	







	

	
}
