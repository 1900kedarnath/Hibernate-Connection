package com.tyfoon.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private int departmentId;
	private String departmentName;
	
	
	private int departmentCapacity;

	
	
	public Department() {
		super();
	}

	public Department(String departmentName, int departmentId, int departmentCapacity) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId;
		this.departmentCapacity = departmentCapacity;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getDepartmentCapacity() {
		return departmentCapacity;
	}

	public void setDepartmentCapacity(int departmentCapacity) {
		this.departmentCapacity = departmentCapacity;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentId=" + departmentId
				+ ", departmentCapacity=" + departmentCapacity + "]";
	}
	
	
}
