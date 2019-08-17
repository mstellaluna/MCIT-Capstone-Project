package com.marymule.dao;

import java.util.List;

import com.marymule.model.Course;
import com.marymule.model.ClassSchedule;


public interface ClassScheduleDAO {
	
	void insertSchedule(ClassSchedule schedule); 
	void updateSchedule(ClassSchedule schedule); 
	void deleteSchedule(int id); 
	ClassSchedule getScheduleById(int id);
	List<ClassSchedule> getAllSchedule();



}
