package com.tyfoon.hibernate.entity;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.type.BlobType;

@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private int departmentId;
	private String departmentName;
	
	private int departmentCapacity;

	@Transient
	private int departmentRank;
	
	@Lob
	private byte[] image;
	
	@Temporal(TemporalType.DATE)
	private Date date ;

	
	
	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, int departmentCapacity, int departmentRank, byte[] image,
			Date date) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentCapacity = departmentCapacity;
		this.departmentRank = departmentRank;
		this.image = image;
		this.date = date;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentCapacity=" + departmentCapacity + ", departmentRank=" + departmentRank + ", image="
				+ Arrays.toString(image) + ", date=" + date + "]";
	}
	
	
	
}
