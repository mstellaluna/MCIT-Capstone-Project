package com.marymule.dao;

import java.util.List;

import com.marymule.model.Results;



public interface ResultsDAO {
	
	void insertResult(Results results);
	void deleteResults(int id);
	void updateResults(Results results);
	Results getResultsById(int id);
	List<Results> getAllResults();

}
