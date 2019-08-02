package com.marymule.service;

import java.util.List;
import java.util.Set;

import com.marymule.model.Course;
import com.marymule.model.Student;
import com.marymule.model.Teacher;

public interface CourseService {
	
	void insertCourse(Course course); 
	void updateCourse(Course course); 
	void deleteCourse(int id); 
	Course getCourseById(int id);
	List<Course> getAllCourses();
	Set<Teacher> getTeachersAssignedToCourse(int id);
	Set<Student> getStudentsAssignedToCourse(int id);
	
    public boolean registerStudent(int courseID, int studentID);
    public boolean registerTeacher(int courseID, int teacherID);
    public boolean unregisterStudent(int courseID, int studentID);
    public boolean unregisterTeacher(int courseID, int teacherID);  

}
