package com.marymule.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marymule.model.ClassSchedule;
import com.marymule.model.Locations;
import com.marymule.service.LocationsService;

@Controller
@RequestMapping("/locations")
public class LocationsController {

	
	@Autowired
	private LocationsService locationsService;
	
	@GetMapping(value = "/location_add")
	public String getAddLocationForm(Model model) {
		model.addAttribute("locations", new Locations());
		return "addLocations";
	}
	
	@PostMapping(value = "/addLocations")
	public String addLocation(@Valid Locations locations, Model model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "addLocations";
		}
		
		locationsService.insertLocation(locations);
		model.addAttribute("locationList", locationsService.getAllLocations());
		return "displayAllLocations";
	}
	
	@GetMapping(value = "/location_list")
	public String displayAllLocations(Model model) {
		List<Locations> locationList = locationsService.getAllLocations();
			if(locationList.isEmpty()) {
				model.addAttribute("emptyLocationList", "There are no locations available in the system. Please contact Program Administrator");
			}
	model.addAttribute("locationsList", locationList);
	return "displayAllLocations";
	}
	
	@GetMapping(value = "/edit_location/{id}")
	public String displayEditLocationForm(@PathVariable("id") int id, Model model){
		List<ClassSchedule> locationSchedule = locationsService.getScheduleByLocationId(id);
		if(locationSchedule.isEmpty()) {
			model.addAttribute("emptyLocationSchedule", "There are no classes scheduled for this location. Please contact Program Administrator");
		}
		model.addAttribute("locations", locationsService.getLocationById(id));
		model.addAttribute("locationSchedule", locationSchedule);
		return "editLocations";
		
	}
	
	@PostMapping(value = "/updateLocations")
	public String saveEditedLocation(@ModelAttribute("locations") Locations locations){
		locationsService.updateLocation(locations);
		return "redirect:location_list";
		
	}
	
	@GetMapping(value = "/location_details/{id}")
	public String displayLocationsDetailsForm(@PathVariable("id") int id, Model model) {
		List<ClassSchedule> locationSchedule = locationsService.getScheduleByLocationId(id);
		if(locationSchedule.isEmpty()) {
			model.addAttribute("emptyLocationList", "There are no locations in the system. Please contact Program Administrator");
		}
		model.addAttribute("locations", locationsService.getLocationById(id));
	    model.addAttribute("locationSchedule", locationSchedule);
		return "locationDetails";
	}
	
	@GetMapping(value = "/delete_location")
	public String deleteLocation(@RequestParam("id") int id, Model model) {
		locationsService.deleteLocation(id);
		return "displayAllLocations";
	}
	
	
	
	
}
