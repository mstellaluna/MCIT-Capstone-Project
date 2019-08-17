package com.marymule.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.LocationsDAO;
import com.marymule.model.ClassSchedule;
import com.marymule.model.Locations;
import com.marymule.service.LocationsService;

@Service
@org.springframework.transaction.annotation.Transactional
public class LocationsServiceImpl implements LocationsService {
	
	@Autowired
	private LocationsDAO locationsDAO;

	@Override
	public void insertLocation(Locations location) {
		locationsDAO.insertLocation(location);
		
	}

	@Override
	public Locations updateLocation(Locations location) {
		return locationsDAO.updateLocation(location);
	}

	@Override
	public void deleteLocation(int id) {
		locationsDAO.deleteLocation(id);
		
	}

	@Override
	public Locations getLocationById(int id) {
		return locationsDAO.getLocationById(id);
	}

	@Override
	public List<Locations> getAllLocations() {
		return locationsDAO.getAllLocations();
	}


	

}
