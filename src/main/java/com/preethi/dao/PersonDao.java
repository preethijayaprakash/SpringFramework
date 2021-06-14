package com.preethi.dao;

import java.util.List;

import com.preethi.model.Person;

/**
 * @author Preethi Jayaprakash
 *
 */
public interface PersonDao {
	
	public void addPerson(Person person);

	public List<Person> listPersons();
	
	public Person getPerson(int personid);
	
	public void deletePerson(Person person);
}
