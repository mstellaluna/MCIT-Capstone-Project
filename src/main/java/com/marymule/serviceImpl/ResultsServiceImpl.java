package com.marymule.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.ResultsDAO;
import com.marymule.model.Results;
import com.marymule.service.ResultsService;

@Service
@org.springframework.transaction.annotation.Transactional
public class ResultsServiceImpl implements ResultsService{
	
	@Autowired
	private ResultsDAO resultsDAO;

	@Override
	public void insertResult(Results results) {
		resultsDAO.insertResult(results);
		
	}

	@Override
	public void deleteResults(Results results) {
		resultsDAO.deleteResults(results);
		
	}

	@Override
	public Results updateResults(Results results) {
		return resultsDAO.updateResults(results);

	}

	@Override
	public Results getResultsById(int student_id) {
		return resultsDAO.getResultsById(student_id);
	}

	@Override
	public List<Results> getAllResults() {
			return resultsDAO.getAllResults();
	}

}
