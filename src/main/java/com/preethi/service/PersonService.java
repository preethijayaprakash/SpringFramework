package com.preethi.service;

import java.util.List;

import com.preethi.model.Person;

/**
 * @author Preethi jayaprakash
 *
 */
public interface PersonService {
	
	public void addPerson(Person person);

	public List<Person> listPerson();
	
	public Person getPersonId(int personId);
	
	public void deletePerson(Person person);
}
