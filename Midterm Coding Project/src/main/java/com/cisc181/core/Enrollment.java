package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	/*
	 * private no-arg constructor
	 */
	@SuppressWarnings("unused")
	private Enrollment(){
		
	}
	
	/*
	 * setters and getters for the enrollment attributes
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}


	/*
	 * two-arg constructor 
	 */
	Enrollment(UUID SectionID, UUID StudentID, double Grade){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = EnrollmentID;
		
		
		
	/*
	 * 	setGrade procedure
	 */
	@SuppressWarnings("unused")
	Object setGrade;
	setGrade(Grade);{
		this.Grade = Grade;
	}

	}
	private void setGrade(double grade2) {
		// TODO Auto-generated method stub
		
	}
	
}
