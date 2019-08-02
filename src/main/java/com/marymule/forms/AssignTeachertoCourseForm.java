package com.marymule.forms;

import javax.validation.constraints.NotNull;

import com.marymule.model.Course;
import com.marymule.model.Teacher;


/**
 * The Class AssignTeachertoCourseForm.
 */
public class AssignTeacherToCourseForm {
	
	/** The teacher id. */
	@NotNull
	private int teacherId;
	
	/** The course id. */
	@NotNull 
	private int courseId;
	
	/** The teachers. */
	private Iterable<Teacher> teachers;
	
	/** The course. */
	private Course course;
	
	/**
	 * Instantiates a new assign teacherto course form.
	 */
	public AssignTeacherToCourseForm() { }

	/**
	 * Instantiates a new assign teacherto course form.
	 *
	 * @param teachers the teachers
	 * @param course the course
	 */
	public AssignTeacherToCourseForm(Iterable<Teacher> teachers, Course course) {
		this.teachers = teachers;
		this.course = course;
	}

	/**
	 * Gets the teacher id.
	 *
	 * @return the teacher id
	 */
	public int getTeacherId() {
		return teacherId;
	}

	/**
	 * Sets the teacher id.
	 *
	 * @param teacherId the new teacher id
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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
	 * Gets the teachers.
	 *
	 * @return the teachers
	 */
	public Iterable<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Sets the teachers.
	 *
	 * @param teachers the new teachers
	 */
	public void setTeachers(Iterable<Teacher> teachers) {
		this.teachers = teachers;
	}

	/**
	 * Gets the course.
	 *
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * Sets the course.
	 *
	 * @param course the new course
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AssignTeacherToCourseForm [teacherId=" + teacherId + ", courseId=" + courseId + ", teachers=" + teachers
				+ ", course=" + course + "]";
	}

	
	
	
	
	

}
