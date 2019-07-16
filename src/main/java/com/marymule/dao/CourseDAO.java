package com.marymule.dao;

import java.util.List;

import com.marymule.model.Course;



public interface CourseDAO {
	
	void insertCourse(Course course); 
	Course updateCourse(Course course); 
	void deleteCourse(int id); 
	Course getCourseById(int id);
	List<Course> getAllCourses();

}
