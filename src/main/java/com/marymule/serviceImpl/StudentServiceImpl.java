package com.marymule.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.StudentDAO;
import com.marymule.model.Student;
import com.marymule.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
    @Autowired
	private StudentDAO studentDAO; 
	

    @org.springframework.transaction.annotation.Transactional
	@Override
	public void insertStudent(Student student) {
		studentDAO.insertStudent(student);
		
	}

    @org.springframework.transaction.annotation.Transactional
	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
		
	}
	
    @org.springframework.transaction.annotation.Transactional
	@Override
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
		
	}

    @org.springframework.transaction.annotation.Transactional
	@Override
	public Student getStudentById(int id) {
		return studentDAO.getStudentById(id);
	}
	
    @org.springframework.transaction.annotation.Transactional
	@Override
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

}
