package com.marymule.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.marymule.dao.StudentDAO;
import com.marymule.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
    private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

	@Override
	public void insertStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(student);
		}

	@Override
	public void updateStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.update(student);
				
	}

	@Override
	public void deleteStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = (Student) session.load(Student.class, new Integer(id));
		if(null != student) {
			session.delete(student);
		}
		
	}

	@Override
	public Student getStudentById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = (Student) session.load(Student.class, new Integer(id));
		return student;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {
		Session session = sessionFactory.getCurrentSession();
		Criteria critera = session.createCriteria(Student.class).addOrder(Order.asc("id"));
		List<Student> studentList = critera.list();
		return studentList;
	}

}
