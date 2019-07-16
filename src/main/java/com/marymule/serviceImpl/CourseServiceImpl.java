package com.marymule.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.CourseDAO;
import com.marymule.model.Course;
import com.marymule.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDAO courseDAO;
	
	@org.springframework.transaction.annotation.Transactional
	@Override
	public void insertCourse(Course course) {
		courseDAO.insertCourse(course);
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public void updateCourse(Course course) {
		courseDAO.updateCourse(course);
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public void deleteCourse(int id) {
		courseDAO.deleteCourse(id);
		
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public Course getCourseById(int id) {
		return courseDAO.getCourseById(id);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseDAO.getAllCourses();
	}

}
