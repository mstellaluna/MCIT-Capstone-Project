package com.marymule.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.TeacherDAO;
import com.marymule.model.Teacher;
import com.marymule.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherDAO teacherDAO;

	@org.springframework.transaction.annotation.Transactional
	@Override
	public void insertTeacher(Teacher teacher) {
		teacherDAO.insertTeacher(teacher);
		
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public void updateTeacher(Teacher teacher) {
		teacherDAO.updateTeacher(teacher);
	}

	@org.springframework.transaction.annotation.Transactional
	@Override
	public void deleteTeacher(int id) {
		teacherDAO.deleteTeacher(id);
		
	}
	
	@org.springframework.transaction.annotation.Transactional
	@Override
	public Teacher getTeacherById(int id) {
		return teacherDAO.getTeacherById(id);
	}
	
	@org.springframework.transaction.annotation.Transactional
	@Override
	public List<Teacher> getAllTeachers() {
		return teacherDAO.getAllTeachers();
	}

	
}
