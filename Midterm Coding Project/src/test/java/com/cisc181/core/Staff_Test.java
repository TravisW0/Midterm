package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.hibernate.hql.internal.ast.tree.AggregatedSelectExpression;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;


public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void AverageSalaryTest() {
		
		ArrayList <Staff> StaffList = new ArrayList <Staff>(); 
		Date date = new Date();
		
		Staff example1 = new Staff("Jane","Samantha","Doe", "1 West Main Street","302-111-2222","janesd@gmail.com","12pm-6pm", 90000.00, eTitle.MRS);
		Staff example2 = new Staff("John","Magic","Doe", "1 West Main Street","302-222-1111","johnmd@gmail.com","2pm-9pm", 100000.00, eTitle.MR);
		Staff example3 = new Staff("Lebron","Raymone","James", "20 Cleveland Avenue","302-123-456","lebron@gmail.com","12pm-8pm", 125000.00, eTitle.MR);
		Staff example4 = new Staff("Kobe","Dwayne","Bryant", "69 South Main Street", "302-444-1234","kobe@gmail.com","11pm-7pm", 120000.00, eTitle.MR);
		Staff example5 = new Staff("Samantha","Smith","Reed", "200 East Cleveland Avenue", "302-999-8765","andysr@gmail.com","2pm-10pm", 110000.00, eTitle.MRS);
		
		Staff.add(example1);
		Staff.add(example2);
		Staff.add(example3);
		Staff.add(example4);
		Staff.add(example5);
		
		// I think i did everything up until the JUnit tests perfect, but i cant for the life of me figure out
		// the JUnit tests at all
	}	

}
