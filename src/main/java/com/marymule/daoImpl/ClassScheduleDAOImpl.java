package com.marymule.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marymule.dao.ClassScheduleDAO;
import com.marymule.model.Course;
import com.marymule.model.ClassSchedule;

@Repository
public class ClassScheduleDAOImpl implements ClassScheduleDAO{
	
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertSchedule(ClassSchedule classSchedule) {
		em.persist(classSchedule);
		
	}

	@Override
	public void updateSchedule(ClassSchedule classSchedule) {
		em.merge(classSchedule);
	}

	@Override
	public void deleteSchedule(int id) {
		ClassSchedule entity = em.find(ClassSchedule.class, id);
		em.remove(entity);
		
	}

	@Override
	public ClassSchedule getScheduleById(int id) {
		return em.find(ClassSchedule.class, id);
	}

	@Override
	public List<ClassSchedule> getAllSchedule() {
		return em.createQuery("SELECT cs FROM ClassSchedule cs", ClassSchedule.class).getResultList();
	}


}
