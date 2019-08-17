package com.marymule.service;

import java.util.List;
import java.util.Set;

import com.marymule.model.ClassSchedule;
import com.marymule.model.Locations;

public interface LocationsService {

	void insertLocation(Locations location); 
	Locations updateLocation(Locations location); 
	void deleteLocation(int id); 
	Locations getLocationById(int id);
	List<Locations> getAllLocations();

}
