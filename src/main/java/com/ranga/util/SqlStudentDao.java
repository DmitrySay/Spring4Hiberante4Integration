package com.ranga.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ranga.entity.Student;


@Service
public class SqlStudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Student> getAll() {
		
		Query query=sessionFactory.getCurrentSession().createQuery("from Student");
		return query.list();
		
	}


}
