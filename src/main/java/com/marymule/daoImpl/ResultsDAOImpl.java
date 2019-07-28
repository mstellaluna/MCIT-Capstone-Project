package com.marymule.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marymule.dao.ResultsDAO;
import com.marymule.model.Results;

@Repository
public class ResultsDAOImpl implements ResultsDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertResult(Results results) {
		em.persist(results);
		
	}

	@Override
	public void deleteResults(Results results) {
			
		
	}

	@Override
	public Results updateResults(Results results) {
		return results;

		
	}

	@Override
	public Results getResultsById(int student_id) {
		return em.find(Results.class, student_id);
	}

	@Override
	public List<Results> getAllResults() {
		return em.createQuery("SELECT r FROM Results r", Results.class).getResultList();
	}

}
