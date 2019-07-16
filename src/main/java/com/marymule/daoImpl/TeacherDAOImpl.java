package com.marymule.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.marymule.dao.TeacherDAO;
import com.marymule.model.Teacher;

@Repository
public class TeacherDAOImpl implements TeacherDAO{

	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insertTeacher(Teacher teacher) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(teacher);
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		Session session = sessionFactory.getCurrentSession();
		session.update(teacher);
		
	}

	@Override
	public void deleteTeacher(int id) {
		Session session = sessionFactory.getCurrentSession();
		Teacher teacher = (Teacher) session.get(Teacher.class, id);
		session.delete(teacher);
		
	}

	@Override
	public Teacher getTeacherById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Teacher teacher = (Teacher) session.get(Teacher.class, id);
		return teacher;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> getAllTeachers() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Teacher.class).addOrder(Order.asc("id"));
		List<Teacher> teacherList = criteria.list();
		return teacherList;
	}

}
