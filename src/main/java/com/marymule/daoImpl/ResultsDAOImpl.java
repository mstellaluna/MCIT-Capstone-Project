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
	public void deleteResults(int id) {
		Results entity = em.find(Results.class, id);
		em.remove(entity);
			
		
	}

	@Override
	public Results updateResults(Results results) {
		return em.merge(results);

		
	}

	@Override
	public Results getResultsById(int id) {
		return em.find(Results.class, id);
	}

	@Override
	public List<Results> getAllResults() {
		return em.createQuery("SELECT r FROM Results r", Results.class).getResultList();
	}

}
