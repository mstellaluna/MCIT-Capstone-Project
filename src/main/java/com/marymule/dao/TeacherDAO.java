package com.marymule.dao;

import java.util.List;

import com.marymule.model.Teacher;



public interface TeacherDAO {

	void insertTeacher(Teacher teacher); 
	Teacher updateTeacher(Teacher teacher); 
	void deleteTeacher(int id); 
	Teacher getTeacherById(int id);
	List<Teacher> getAllTeachers();
}
