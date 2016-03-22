package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	
		/*
		 * Implemented the enum eMajor and created a getter and setter
		 */
	   public Student(eMajor major){
	        this.Major = major;
	    }

	    public void setMajor(eMajor major){
	        this.Major = major;
	    }
	    public eMajor getMajor(){
	        return this.Major;
	    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email)
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = getMajor();
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}