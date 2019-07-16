package com.marymule.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marymule.dao.TeacherDAO;
import com.marymule.model.Teacher;

@Repository
public class TeacherDAOImpl implements TeacherDAO{

	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertTeacher(Teacher teacher) {
		em.persist(teacher);
		
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return em.merge(teacher);
	}

	@Override
	public void deleteTeacher(int id) {
		Teacher entity = em.find(Teacher.class, id);
		em.remove(entity);
		
	}

	@Override
	public Teacher getTeacherById(int id) {
		return em.find(Teacher.class, id);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return em.createQuery("SELECT t FROM Teacher t", Teacher.class).getResultList();
	}

}
