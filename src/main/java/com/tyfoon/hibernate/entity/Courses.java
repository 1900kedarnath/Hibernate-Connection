package com.tyfoon.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Courses {
	
	
	@Id
	private int courseId;
	
     private String courseName;
	
	private Float courseFess;
	
	
   @ManyToOne
	private Department department;
   
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	
	
	
	

	public Courses() {
		super();
	}

	public Courses(String courseName, Float courseFess) {
		super();
		this.courseName = courseName;
		courseFess = courseFess;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Float getCourseFess() {
		return courseFess;
	}

	public void setCourseFess(Float courseFess) {
		courseFess = courseFess;
	}

	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + ", CourseFess=" + courseFess + "]";
	}
	
	

}

