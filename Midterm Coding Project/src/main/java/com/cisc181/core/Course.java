package com.cisc181.core;

import java.util.UUID;

public class Course {
	
	/*
	 * Course attributes
	 */
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private String Major;
	
	
	
	/*
	 * no-arg construtor
	 */
	Course(){	
	}
	
	
	
	/*
	 * setters and getters for course attributes
	 */
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
		
}