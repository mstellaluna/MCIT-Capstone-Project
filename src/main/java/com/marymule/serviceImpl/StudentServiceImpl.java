package com.marymule.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.marymule.dao.StudentDAO;
import com.marymule.model.Student;
import com.marymule.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
   
	private StudentDAO studentDAO; 
	

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	@Transactional
	public void insertStudent(Student student) {
		studentDAO.insertStudent(student);
		
	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
		
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
		
	}

	@Override
	@Transactional
	public Student getStudentById(int id) {
		return studentDAO.getStudentById(id);
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

}
