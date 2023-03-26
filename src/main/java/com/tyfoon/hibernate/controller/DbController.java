package com.tyfoon.hibernate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyfoon.hibernate.services.CountryService;
import com.tyfoon.hibernate.services.DepartmentServices;

@RestController
public class DbController {

@Autowired
CountryService countryService ;
@Autowired
DepartmentServices departmentServices;
	
@RequestMapping("/")

public String insertBySession() {
	
	 countryService.insertBySession();
	
	return "sucess" ;
}

@RequestMapping("/persistence")
public String insertByPersistence() {
	
	departmentServices.insertDatabyPersistence();
	
	return "sucess" ;
}

}
