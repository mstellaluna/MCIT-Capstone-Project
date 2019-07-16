package com.marymule.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marymule.dao.TeacherDAO;
import com.marymule.model.Teacher;
import com.marymule.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	private TeacherDAO teacherDAO;

	@Override
	public void insertTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeacher(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Teacher getTeacherById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

}
