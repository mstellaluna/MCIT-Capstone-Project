package com.marymule.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.ResultsDAO;
import com.marymule.model.Results;
import com.marymule.model.Student;
import com.marymule.service.CourseService;
import com.marymule.service.ResultsService;
import com.marymule.service.StudentService;

@Service
@org.springframework.transaction.annotation.Transactional
public class ResultsServiceImpl implements ResultsService{
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private ResultsDAO resultsDAO;
	
	// Setter Injection
	 public void setResultDAO(ResultsDAO resultsDAO) {
	        this.resultsDAO = resultsDAO;
	    }

	@Override
	public boolean insertResult(Results results) {
		Student student = studentService.getStudentById(results.getStudentId());
		if (!student.getCoursesRegistered().contains(courseService.getCourseById(results.getCourseId()))) {
			return false;
		}
		else {
			results.setStudentResult(studentService.getStudentById(results.getStudentId()));
			results.setCourseResult(courseService.getCourseById(results.getCourseId()));
			resultsDAO.insertResult(results);
			return true;
		}
	}

	@Override
	public void deleteResults(int id) {
		resultsDAO.deleteResults(id);
		
	}

	@Override
	public boolean updateResults(Results results) {
		Student student = studentService.getStudentById(results.getStudentId());
		if(!student.getCoursesRegistered().contains(courseService.getCourseById(results.getCourseId()))) {
			return false;
		}
		else {
			results.setStudentResult(studentService.getStudentById(results.getStudentId()));
			results.setCourseResult(courseService.getCourseById(results.getStudentId()));
			resultsDAO.updateResults(results);
			return true;
		}	

	}

	@Override
	public Results getResultsById(int id) {
		return resultsDAO.getResultsById(id);
	}

	@Override
	public List<Results> getAllResults() {
			return resultsDAO.getAllResults();
	}

}
