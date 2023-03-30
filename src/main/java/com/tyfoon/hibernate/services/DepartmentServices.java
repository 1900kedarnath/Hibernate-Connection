package com.tyfoon.hibernate.services;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.tyfoon.hibernate.entity.Courses;
import com.tyfoon.hibernate.entity.Department;

@Service
public class DepartmentServices {


	public void insertDatabyPersistence() throws Exception{
		
		Department department=new Department();
		department.setDepartmentName("Mathematices");
		department.setDepartmentCapacity(10);
	
		department.setDepartmentRank(10);
		
		Courses courses1=new Courses();
		courses1.setCourseName("Statistic");
		courses1.setCourseFess(200000.0f);
		courses1.setCourseId(290);
		
		Courses courses2=new Courses();
		courses2.setCourseName("Mathematics");
		courses2.setCourseFess(400000.0f);
		courses2.setCourseId(270);
		List<Courses> courses=new ArrayList() ;
		courses.add(courses1);
		courses.add(courses2);
		department.setCourses(courses);
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		 entityManager.persist(courses1);
		 entityManager.persist(courses2);
		 
		 entityManager.persist(department);
		 entityTransaction.commit();
		 entityManager.close();
		
	}
	

}
