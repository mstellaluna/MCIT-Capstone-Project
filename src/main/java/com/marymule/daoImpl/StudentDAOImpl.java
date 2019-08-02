package com.marymule.daoImpl;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marymule.dao.StudentDAO;
import com.marymule.model.Course;
import com.marymule.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
@PersistenceContext
private EntityManager em;


@Override
public void insertStudent(Student student) {
	em.persist(student);
}


@Override
public Student updateStudent(Student student) {
	 return em.merge(student); 
}


@Override
public void deleteStudent(int id) {
	Student entity = em.find(Student.class, id); 
	em.remove(entity);
	
}


@Override
public Student getStudentById(int id) {
	 return em.find(Student.class, id);
	 
}


@Override
public List<Student> getAllStudents() {
	 return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();

}


@Override
public Set<Course> getStudentsRegisteredCourses(int id) {
	Student entity = em.find(Student.class, id);
	return entity.getCoursesRegistered();
}







	
   

}
