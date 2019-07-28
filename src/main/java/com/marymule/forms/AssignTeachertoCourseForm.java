package com.marymule.forms;

import javax.validation.constraints.NotNull;

import com.marymule.model.Course;
import com.marymule.model.Teacher;

public class AssignTeachertoCourseForm {
	
	@NotNull
	private int teacherId;
	
	@NotNull 
	private int courseId;
	
	private Iterable<Teacher> teachers;
	
	private Course course;
	
	public AssignTeachertoCourseForm() { }

	public AssignTeachertoCourseForm(Iterable<Teacher> teachers, Course course) {
		this.teachers = teachers;
		this.course = course;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Iterable<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Iterable<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "AssignTeachertoCourseForm [teacherId=" + teacherId + ", courseId=" + courseId + ", teachers=" + teachers
				+ ", course=" + course + "]";
	}

	
	
	
	
	

}
