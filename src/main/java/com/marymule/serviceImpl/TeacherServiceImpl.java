package com.marymule.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.TeacherDAO;
import com.marymule.model.Course;
import com.marymule.model.Teacher;
import com.marymule.service.TeacherService;

@Service
@org.springframework.transaction.annotation.Transactional
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherDAO teacherDAO;

	
	@Override
	public void insertTeacher(Teacher teacher) {
		teacherDAO.insertTeacher(teacher);
		
	}


	@Override
	public void updateTeacher(Teacher teacher) {
		teacherDAO.updateTeacher(teacher);
	}


	@Override
	public void deleteTeacher(int id) {
		teacherDAO.deleteTeacher(id);
		
	}
	

	@Override
	public Teacher getTeacherById(int id) {
		return teacherDAO.getTeacherById(id);
	}
	

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherDAO.getAllTeachers();
	}


	@Override
	public Set<Course> getTeachersAssignedCourses(int id) {
		return teacherDAO.getTeacherAssignedCourses(id);
	}



	
}
