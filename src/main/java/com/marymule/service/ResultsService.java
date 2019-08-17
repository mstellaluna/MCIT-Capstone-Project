package com.marymule.service;

import java.util.List;

import com.marymule.model.Results;

public interface ResultsService {

	boolean insertResult(Results results);
	void deleteResults(int id);
	boolean updateResults(Results results);
	Results getResultsById(int id);
	List<Results> getAllResults();
	
}
