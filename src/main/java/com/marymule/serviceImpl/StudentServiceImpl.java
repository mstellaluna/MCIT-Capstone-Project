package com.marymule.serviceImpl;

import java.util.List;

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
	public void insertStudent(Student student) {
		studentDAO.insertStudent(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
