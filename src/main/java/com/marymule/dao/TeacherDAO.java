package com.marymule.dao;

import java.util.List;

import com.marymule.model.Teacher;



public interface TeacherDAO {

	void insertTeacher(Teacher teacher); 
	void updateTeacher(Teacher teacher); 
	void deleteTeacher(int id); 
	Teacher getTeacherById(int id);
	List<Teacher> getAllTeachers();
}
