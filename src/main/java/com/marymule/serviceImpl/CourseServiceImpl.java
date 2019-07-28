package com.marymule.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.CourseDAO;
import com.marymule.dao.StudentDAO;
import com.marymule.dao.TeacherDAO;
import com.marymule.model.Course;
import com.marymule.model.Student;
import com.marymule.model.Teacher;
import com.marymule.service.CourseService;

@Service
@org.springframework.transaction.annotation.Transactional
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDAO courseDAO;
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private TeacherDAO teacherDAO;
	

	@Override
	public void insertCourse(Course course) {
		courseDAO.insertCourse(course);
	}

	
	@Override
	public void updateCourse(Course course) {
		courseDAO.updateCourse(course);
	}

	
	@Override
	public void deleteCourse(int id) {
		courseDAO.deleteCourse(id);
		
	}

	
	@Override
	public Course getCourseById(int id) {
		return courseDAO.getCourseById(id);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseDAO.getAllCourses();
	}


	@Override
	public boolean registerStudent(int courseID, int studentID) {
        Course course = courseDAO.getCourseById(courseID);
        Set<Student> students = course.getStudentsRegistered();
        for(Student student : students) 
            if(student.getId() == studentID)
                return false;
        course.getStudentsRegistered().add(studentDAO.getStudentById(studentID));       
        this.updateCourse(course);
        return true;
	}

	
	@Override
	public boolean registerTeacher(int courseID, int teacherID) {
	     Course course = courseDAO.getCourseById(courseID);
	        Set<Teacher> teachers = course.getTeachersRegistered();
	        for(Teacher teacher : teachers) 
	            if(teacher.getId() == teacherID)
	                return false;
	        course.getTeachersRegistered().add(teacherDAO.getTeacherById(teacherID));       
	        this.updateCourse(course);
	        return true;
	}

}
