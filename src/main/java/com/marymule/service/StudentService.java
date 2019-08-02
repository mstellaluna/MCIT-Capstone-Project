package com.marymule.service;

import java.util.List;
import java.util.Set;

import com.marymule.model.Course;
import com.marymule.model.Student;

public interface StudentService {

		void insertStudent(Student student);
		void updateStudent(Student student);
		void deleteStudent(int id);
		Student getStudentById(int id);
		List<Student> getAllStudents();
		Set<Course> getStudentsRegisteredCourses(int id);
	}

