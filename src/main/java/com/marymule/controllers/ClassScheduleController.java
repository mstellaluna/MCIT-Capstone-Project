package com.marymule.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marymule.forms.AddScheduleForm;
import com.marymule.model.ClassSchedule;
import com.marymule.service.ClassScheduleService;
import com.marymule.service.CourseService;
import com.marymule.service.LocationsService;

@Controller
@RequestMapping(value = "/schedule")
public class ClassScheduleController {
	
   @Autowired
   private ClassScheduleService classScheduleService;
		
	@Autowired
	  private CourseService courseService;
	
	@Autowired
	  private LocationsService locationService;
	
	@GetMapping(value="/schedule_add")
	public String getAddSchedulePage(Model model) {
		model.addAttribute("schedule", new ClassSchedule());
		model.addAttribute("locationList", locationService.getAllLocations());
		model.addAttribute("courseList", courseService.getAllCourses());
		return "addSchedule";
	}
	
	  @PostMapping(value = "/addSchedule") 
	  public String saveClassSchedule(@ModelAttribute("classSchedule") 
	  								  @DateTimeFormat(pattern="HH:mm") 
	  								  @Valid AddScheduleForm form, BindingResult bindingResult) {
	  
	  ClassSchedule classSchedule = new ClassSchedule();
	  classSchedule.setLocationID(form.getLocationId());
	  classSchedule.setCourseID(form.getCourseId());
	  classSchedule.setStartTime(form.getStartTime());
	  classSchedule.setEndTime(form.getEndTime());
	  classSchedule.setClassDate(form.getClassDate());
	  classScheduleService.insertSchedule(classSchedule);
	  	System.out.println(classSchedule);
	  return "displayAllClassSchedules";
	  
	 }
	  
	  @GetMapping(value = "/schedule_list")
	  public String displayAllClassSchedules(Model model) {
	  List<ClassSchedule> scheduleList = classScheduleService.getAllSchedule();
	  	model.addAttribute("scheduleList", scheduleList);
	  	return "displayAllClassSchedules";
	  }
	  
	  @GetMapping(value = "/edit_schedule/{id}")
	  public String getEditScheduleForm(@PathVariable("id") int id, Model model) {
			model.addAttribute("locationList", locationService.getAllLocations());
			model.addAttribute("courseList", courseService.getAllCourses());
		  return "editSchedule";
	 }
	  
	  
	  @PostMapping(value = "/updateSchedule")
	  public String saveEditedSchedule(@ModelAttribute("classSchedule") 
	  								   @DateTimeFormat(pattern="HH:mm") 
	  								   @Valid ClassSchedule classSchedule, 
	  								   Model model, BindingResult bindingResult) {
		  System.out.println(classSchedule);
		  classScheduleService.updateSchedule(classSchedule);
			model.addAttribute("scheduleList", classScheduleService.getAllSchedule());
			return "displayAllClassSchedules";
	 }
	  
	  @GetMapping(value = "/delete_schedule")
	  public String deleteScheduleEntry(@RequestParam("id") int id, Model model) {
	  classScheduleService.deleteSchedule(id);
	  return "displayAllClassSchedules";
	  }

}
