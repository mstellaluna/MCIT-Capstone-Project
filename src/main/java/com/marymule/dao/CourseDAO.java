package com.marymule.dao;

import java.util.List;
import java.util.Set;

import com.marymule.model.ClassSchedule;
import com.marymule.model.Course;
import com.marymule.model.Student;
import com.marymule.model.Teacher;



public interface CourseDAO {
	
	void insertCourse(Course course); 
	Course updateCourse(Course course); 
	void deleteCourse(int id); 
	Course getCourseById(int id);
	List<Course> getAllCourses();
	Set<Teacher> getTeachersAssignedToCourse(int id);
	Set<Student> getStudentsAssignedToCourse(int id);
	List<ClassSchedule> getScheduleByCourseId(int id);

	
	
	


	

}
