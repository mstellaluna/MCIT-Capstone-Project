package com.marymule.service;

import java.util.List;

import com.marymule.model.Results;

public interface ResultsService {

	void insertResult(Results results);
	void deleteResults(Results results);
	Results updateResults(Results results);
	Results getResultsById(int student_id);
	List<Results> getAllResults();
	
}
