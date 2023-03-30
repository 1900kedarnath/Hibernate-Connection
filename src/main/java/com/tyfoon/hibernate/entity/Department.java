package com.tyfoon.hibernate.entity;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.type.BlobType;

@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int departmentId;
	private String departmentName;
	
	private int departmentCapacity;


	private int departmentRank;

//    @OneToOne
//    @JoinColumn
	@OneToMany(mappedBy ="department")
	private List<Courses> courses ;
    
	
  
	public List<Courses> getCourses() {
		return courses;
	}


	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}


	public Department() {
		super();
	}


	public Department(int departmentId, String departmentName, int departmentCapacity, int departmentRank) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentCapacity = departmentCapacity;
		this.departmentRank = departmentRank;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public int getDepartmentCapacity() {
		return departmentCapacity;
	}


	public void setDepartmentCapacity(int departmentCapacity) {
		this.departmentCapacity = departmentCapacity;
	}


	public int getDepartmentRank() {
		return departmentRank;
	}


	public void setDepartmentRank(int departmentRank) {
		this.departmentRank = departmentRank;
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentCapacity=" + departmentCapacity + ", departmentRank=" + departmentRank + "]";
	}
	


	
	
	
}