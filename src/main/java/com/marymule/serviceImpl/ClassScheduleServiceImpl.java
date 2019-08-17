package com.marymule.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marymule.dao.ClassScheduleDAO;
import com.marymule.model.ClassSchedule;
import com.marymule.model.Course;
import com.marymule.model.Locations;
import com.marymule.service.ClassScheduleService;
import com.marymule.service.CourseService;
import com.marymule.service.LocationsService;

@Service
@org.springframework.transaction.annotation.Transactional
public class ClassScheduleServiceImpl implements ClassScheduleService {

	@Autowired
	private ClassScheduleDAO classScheduleDAO;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private LocationsService locationsService;
	
	
	//Setter Injection
	 public void setClassScheduleDAO(ClassScheduleDAO classScheduleDAO) {
		this.classScheduleDAO = classScheduleDAO;
	}

	@Override
	public void insertSchedule(ClassSchedule classSchedule) {
		classSchedule.setScheduledCourses(courseService.getCourseById(classSchedule.getCourseID()));
		classSchedule.setScheduledLocations(locationsService.getLocationById(classSchedule.getLocationID()));
		classScheduleDAO.insertSchedule(classSchedule);
		
	}

	@Override
	public void updateSchedule(ClassSchedule classSchedule) {
		classSchedule.setScheduledCourses(courseService.getCourseById(classSchedule.getCourseID()));
		classSchedule.setScheduledLocations(locationsService.getLocationById(classSchedule.getLocationID()));
		 classScheduleDAO.updateSchedule(classSchedule);	 
	
	}

	@Override
	public void deleteSchedule(int id) {
		classScheduleDAO.deleteSchedule(id);
		
	}

	@Override
	public ClassSchedule getScheduleById(int id) {
			return classScheduleDAO.getScheduleById(id);
	}

	@Override
	public List<ClassSchedule> getAllSchedule() {
		return classScheduleDAO.getAllSchedule();
	}

}
