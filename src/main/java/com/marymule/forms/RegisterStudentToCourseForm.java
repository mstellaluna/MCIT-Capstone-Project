package com.marymule.forms;

import javax.validation.constraints.NotNull;

import com.marymule.model.Course;
import com.marymule.model.Student;


/**
 * The Class RegisterStudentToCourseForm.
 */
public class RegisterStudentToCourseForm {
	
	/** The course id. */
	@NotNull
	private int courseId;
	
	/** The student id. */
	@NotNull
	private int studentId;
	
	/** The students. */
	private Iterable<Student> students;
	
	/** The course. */
	private Course course;
	
    /**
     * Instantiates a new register student to course form.
     */
    public RegisterStudentToCourseForm() { }

	/**
	 * Instantiates a new register student to course form.
	 *
	 * @param students the students
	 * @param course the course
	 */
	public RegisterStudentToCourseForm(Iterable<Student> students, Course course) {
		this.students = students;
		this.course = course;
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
	 * Gets the students.
	 *
	 * @return the students
	 */
	public Iterable<Student> getStudents() {
		return students;
	}

	/**
	 * Sets the students.
	 *
	 * @param students the new students
	 */
	public void setStudents(Iterable<Student> students) {
		this.students = students;
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
		return "RegisterStudentToCourseForm [courseId=" + courseId + ", studentId=" + studentId + ", students="
				+ students + ", course=" + course + "]";
	}
	
	
}
