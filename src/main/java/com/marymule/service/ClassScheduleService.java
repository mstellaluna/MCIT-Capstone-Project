package com.marymule.service;

import java.util.List;
import java.util.Set;

import com.marymule.model.ClassSchedule;

public interface ClassScheduleService {
	
	void insertSchedule(ClassSchedule classSchedule); 
	void updateSchedule(ClassSchedule classSchedule); 
	void deleteSchedule(int id); 
	ClassSchedule getScheduleById(int id);
	List<ClassSchedule> getAllSchedule();
	


	

}
