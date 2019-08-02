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
		Student student = studentService.getStudentById(results.getStudentID());
		if (!student.getCoursesRegistered().contains(courseService.getCourseById(results.getCourseID()))) {
			return false;
		}
		else {
			results.setStudentResult(studentService.getStudentById(results.getStudentID()));
			results.setCourseResult(courseService.getCourseById(results.getCourseID()));
			resultsDAO.insertResult(results);
			return true;
		}
	}

	@Override
	public void deleteResults(int id, Results results) {
		resultsDAO.deleteResults(id);
		
	}

	@Override
	public boolean updateResults(Results results) {
		Student student = studentService.getStudentById(results.getStudentResult().getId());
		if(!student.getCoursesRegistered().contains(courseService.getCourseById(results.getCourseResult().getId()))) {
			return false;
		}
		else {
			results.setStudentResult(studentService.getStudentById(results.getStudentResult().getId()));
			results.setCourseResult(courseService.getCourseById(results.getCourseResult().getId()));
			resultsDAO.updateResults(results);
			return true;
		}	

	}

	@Override
	public Results getResultsById(int student_id) {
		return resultsDAO.getResultsById(student_id);
	}

	@Override
	public List<Results> getAllResults() {
			return resultsDAO.getAllResults();
	}

}
