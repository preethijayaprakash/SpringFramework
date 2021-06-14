package com.preethi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preethi.dao.PersonDao;
import com.preethi.model.Person;

/**
 * @author Preethi Jayaprakash
 *
 */
@Service("personService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(Person person) {
		personDao.addPerson(person);
	}
	
	public List<Person> listPersons() {
		return personDao.listPersons();
	}

	public Person getPerso(int personid) {
		return personDao.getPerson(personid);
	}
	
	public void deletePerson(Person person) {
		personDao.deletePerson(person);
	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> listPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPersonId(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

}
