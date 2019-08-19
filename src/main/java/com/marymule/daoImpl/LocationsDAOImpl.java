package com.marymule.daoImpl;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marymule.dao.LocationsDAO;
import com.marymule.model.ClassSchedule;
import com.marymule.model.Locations;

@Repository
public class LocationsDAOImpl implements LocationsDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertLocation(Locations location) {
		em.persist(location);
		
	}

	@Override
	public Locations updateLocation(Locations location) {
		return em.merge(location);
	}

	@Override
	public void deleteLocation(int id) {
		Locations entity = em.find(Locations.class, id);
		em.remove(entity);
		
	}

	@Override
	public Locations getLocationById(int id) {
		return em.find(Locations.class, id);
	}

	@Override
	public List<Locations> getAllLocations() {
		return em.createQuery("SELECT l FROM Locations l", Locations.class).getResultList();
		
	}

	@Override
	public List<ClassSchedule> getScheduleByLocationId(int id) {
		Locations entity = em.find(Locations.class, id);
		return entity.getProgramSchedule();
	}



}
