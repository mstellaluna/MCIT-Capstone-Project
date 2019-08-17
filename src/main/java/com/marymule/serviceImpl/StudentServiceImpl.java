package com.marymule.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.CourseDAO;
import com.marymule.dao.ResultsDAO;
import com.marymule.dao.StudentDAO;
import com.marymule.model.Course;
import com.marymule.model.Payment;
import com.marymule.model.Results;
import com.marymule.model.Student;
import com.marymule.service.CourseService;
import com.marymule.service.ResultsService;
import com.marymule.service.StudentService;

@Service
@org.springframework.transaction.annotation.Transactional
public class StudentServiceImpl implements StudentService{
	
    @Autowired
	private StudentDAO studentDAO; 
	
    @Autowired
	private CourseDAO courseDAO; 
    
    @Autowired
   	private CourseService courseService; 
    
    @Autowired
	private ResultsDAO resultsDAO;

    @Autowired
   	private ResultsService resultsService;
   
	@Override
	public void insertStudent(Student student) {
		studentDAO.insertStudent(student);
		
	}

 
	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
		
	}
	

	@Override
	public void deleteStudent(int id) {
		Student student = studentDAO.getStudentById(id);
		List<Course> courseList = courseDAO.getAllCourses();
		for (Course course : courseList) 
			if(student.getCoursesRegistered().contains(course))
				courseService.unregisterStudent(course.getId(), id);
			
		List<Results> resultsList = resultsDAO.getAllResults();
		for (Results result : resultsList) 
			if(result.getStudentResult().equals(student)) 
				resultsService.deleteResults(result.getId());
						
		studentDAO.deleteStudent(id);
			
	}


	@Override
	public Student getStudentById(int id) {
		return studentDAO.getStudentById(id);
	}
	
 
	@Override
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}


	@Override
	public Set<Course> getStudentsRegisteredCourses(int id) {
		return studentDAO.getStudentsRegisteredCourses(id);
	}


	@Override
	public List<Payment> getPaymentByStudentId(int id) {
		return studentDAO.getPaymentByStudentId(id);
	}



}
