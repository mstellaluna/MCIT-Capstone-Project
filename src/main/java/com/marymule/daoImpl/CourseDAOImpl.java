package com.marymule.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marymule.dao.CourseDAO;
import com.marymule.model.Course;

@Repository
public class CourseDAOImpl implements CourseDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void insertCourse(Course course) {
		em.persist(course);
		
	}

	@Override
	public Course updateCourse(Course course) {
		return em.merge(course);
		
	}

	@Override
	public void deleteCourse(int id) {
		Course entity = em.find(Course.class, id);
		em.remove(entity);
		
	}

	@Override
	public Course getCourseById(int id) {
		return em.find(Course.class,id);
	}

	@Override
	public List<Course> getAllCourses() {
		return em.createQuery("SELECT c FROM Course c", Course.class).getResultList();
	}

}
