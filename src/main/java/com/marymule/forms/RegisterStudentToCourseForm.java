package com.marymule.forms;

import javax.validation.constraints.NotNull;

import com.marymule.model.Course;
import com.marymule.model.Student;

public class RegisterStudentToCourseForm {
	
	@NotNull
	private int courseId;
	
	@NotNull
	private int studentId;
	
	private Iterable<Student> students;
	
	private Course course;
	
    public RegisterStudentToCourseForm() { }

	public RegisterStudentToCourseForm(Iterable<Student> students, Course course) {
		this.students = students;
		this.course = course;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Iterable<Student> getStudents() {
		return students;
	}

	public void setStudents(Iterable<Student> students) {
		this.students = students;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "RegisterStudentToCourseForm [courseId=" + courseId + ", studentId=" + studentId + ", students="
				+ students + ", course=" + course + "]";
	}
	
	
}
