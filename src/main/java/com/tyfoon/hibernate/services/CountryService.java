package com.tyfoon.hibernate.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.tyfoon.hibernate.entity.Country;

@Service
public class CountryService {

	
	public void insertBySession() {
		
		Country country=new Country();
		
		 country.setCountryName("india");
		 country.setCountryZone("Asia");
		 
		 Configuration cg=new Configuration();
			cg.configure("hibernate-cfg.xml");
		SessionFactory sf=	 cg.buildSessionFactory() ;
		Session  session  =sf.openSession();
		Transaction transaction= session.beginTransaction();
		 session.save(country);
		 transaction.commit();
		 session.close();
		
	}
}
