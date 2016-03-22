package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;
import java.util.UUID;
import java.util.Date;


public class Student_Test {


	// I think i did everything up until the JUnit tests perfect, but i cant for the life of me figure out
	// the JUnit tests at all, i attempted to add values to each ArrayList but that didnt work either
	
	
	@BeforeClass
	public static void setup() {
	}

		// courses
		ArrayList<Course> courses = new ArrayList<Course>();
		Course Mathematics = new Course();
		Course Fincance = new Course();
		Course French = new Course();
		
		// dont know why any of them wont add to the ArrayList
		courses.add(Mathematics);
		courses.add(Finance);
		courses.add(French);
		
		// semester
		ArrayList<Semester> semester = new ArrayList<Semester>();
		Semester Fall = new Semester();
		Semester Spring = new Semester();
		
		semester.add(Fall);
		semester.add(Spring);
		
		//Section
		ArrayList<Section> section = new ArrayList<Section>();
		Section FallMathematics = new Section();
		Section SpringMathematics = new Section();
		Section FallFinance = new Section();
		Section SpringFinance = new Section();
		Section FallFrench = new Section();
		Section SpringFrench = new Section();
		
		section.add(FallMathematics);
		section.add(SpringMathematics);
		section.add(FallFinance);
		section.add(SpringFinance);
		section.add(FallFrench);
		section.add(SpringFrench);
		
		// student
		ArrayList<Student> student = new ArrayList<Student>();
		Student One = new Student(null);
		Student Two = new Student(null);
		Student Three = new Student(null);
		Student Four = new Student(null);
		Student Five = new Student(null);
		Student Six = new Student(null);
		Student Seven = new Student(null);
		Student Eight = new Student(null);
		Student Nine = new Student(null);
		Student Ten = new Student(null);
		
		student.add(One);
		student.add(Two);
		student.add(Three);
		student.add(Four);
		student.add(Five);
		student.add(Six);
		student.add(Seven);
		student.add(Eight);
		student.add(Nine);
		student.add(Ten);
	
	
	@Test
	public void test() {
		assertEquals(1, 1);
		
		// i think this is how it should start to look but i dont know where to go from here
		for (int i = 0; i < 6; i++) {
			for (int n = 0; n < 10; n++) {
			}
		}
	
	}
	
	
	
	
	
}