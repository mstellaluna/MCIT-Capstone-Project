package com.marymule.dao;

import java.util.List;

import com.marymule.model.Student;


public interface StudentDAO {

	void insertStudent(Student student); 
	Student updateStudent(Student student); 
	void deleteStudent(int id); 
	Student getStudentById(int id);
	List<Student> getAllStudents();

}


