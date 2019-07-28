package com.marymule.service;

import java.util.List;

import com.marymule.model.Course;

public interface CourseService {
	
	void insertCourse(Course course); 
	void updateCourse(Course course); 
	void deleteCourse(int id); 
	Course getCourseById(int id);
	List<Course> getAllCourses();

    public boolean registerStudent(int courseID, int studentID);
    public boolean registerTeacher(int courseID, int teacherID);
  //  public boolean unregisterStudent(int courseID, int studentID);
 //   public boolean unregisterTeacher(int courseID, int teacherID);  

}
