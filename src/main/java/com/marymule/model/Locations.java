package com.marymule.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "locations")
public class Locations {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "locationName")
	private String locationName;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "scheduledLocations")
		private List<ClassSchedule> programSchedule;

	public Locations() {
		super();
	}

	public Locations(int id, String locationName) {
		super();
		this.id = id;
		this.locationName = locationName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	



	public List<ClassSchedule> getProgramSchedule() {
		return programSchedule;
	}

	public void setProgramSchedule(List<ClassSchedule> programSchedule) {
		this.programSchedule = programSchedule;
	}

	@Override
	public String toString() {
		return "Locations [id=" + id + ", locationName=" + locationName + "]";
	}
	
	
	
	
	
	
	
}
