package com.ranga;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ranga.entity.Student;
import com.ranga.util.SqlStudentDao;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationConfig.xml");
		SqlStudentDao sqlStudentDao = (SqlStudentDao) context.getBean("sqlStudentDao");

		System.out.println("++++++++++++++++++++++");

		List<Student> list = sqlStudentDao.getAll();
		for (Student student : list) {
			System.out.println(student);
		}

	}

}
