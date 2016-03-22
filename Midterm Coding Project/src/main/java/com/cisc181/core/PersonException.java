package com.cisc181.core;

import com.cisc181.core.Person;

public class PersonException extends Exception
{

	/*
	 * New exception with person as an attribute
	 */
	private Person person;
	public PersonException(Person person){
		super("PersonException");
		this.person = person;
				
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
