package com.marymule.service;

import java.util.List;

import com.marymule.model.Results;

public interface ResultsService {

	boolean insertResult(Results results);
	void deleteResults(int id, Results results);
	boolean updateResults(Results results);
	Results getResultsById(int student_id);
	List<Results> getAllResults();
	
}
