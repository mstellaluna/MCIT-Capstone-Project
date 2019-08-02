package com.marymule.dao;

import java.util.List;
import java.util.Set;

import com.marymule.model.Course;
import com.marymule.model.Teacher;



public interface TeacherDAO {

	void insertTeacher(Teacher teacher); 
	Teacher updateTeacher(Teacher teacher); 
	void deleteTeacher(int id); 
	Teacher getTeacherById(int id);
	List<Teacher> getAllTeachers();
	Set<Course> getTeacherAssignedCourses(int id);
}
