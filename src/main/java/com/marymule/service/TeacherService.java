package com.marymule.service;

import java.util.List;

import com.marymule.model.Teacher;



public interface TeacherService {
	void insertTeacher(Teacher teacher);
	void updateTeacher(Teacher teacher);
	void deleteTeacher(int id);
	Teacher getTeacherById(int id);
	List<Teacher> getAllTeachers();
}
