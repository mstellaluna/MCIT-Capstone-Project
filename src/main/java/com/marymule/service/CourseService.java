package com.marymule.service;

import java.util.List;

import com.marymule.model.Course;

public interface CourseService {
	
	void insertCourse(Course course); 
	void updateCourse(Course course); 
	void deleteCourse(int id); 
	Course getCourseById(int id);
	List<Course> getAllCourses();

}
