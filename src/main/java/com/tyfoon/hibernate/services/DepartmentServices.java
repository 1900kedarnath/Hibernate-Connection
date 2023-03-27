package com.tyfoon.hibernate.services;

import java.io.FileInputStream;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.tyfoon.hibernate.entity.Department;

@Service
public class DepartmentServices {


	public void insertDatabyPersistence() throws Exception{
		
		Department department=new Department();
		department.setDepartmentName("Mathematices");
		department.setDepartmentCapacity(10);
		department.setDate(new Date());
		department.setDepartmentRank(10);
		FileInputStream fileInputStream=new FileInputStream("E:/kedar.jpg");
		byte [] data =new byte [fileInputStream.available()] ;
		fileInputStream.read(data);
		
		department.setImage(data);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		 entityManager.persist(department);
		 entityTransaction.commit();
		 entityManager.close();
		
	}
	

}
