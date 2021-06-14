package com.preethi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preethi.model.Person;

/**
 * @author Preethi Jayaprakash
 *
 */
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addPerson(Person person) {
		sessionFactory.getCurrentSession().saveOrUpdate(person);
	}

	@SuppressWarnings("unchecked")
	public List<Person> listPerson() {
		return (List<Person>) sessionFactory.getCurrentSession().createCriteria(Person.class).list();
	}

	public Person getPerson(int personid) {
		return (Person) sessionFactory.getCurrentSession().get(Person.class, personid);
	}

	public void deletePerson(Person person) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Person WHERE personid = "+person.getPersonAddress()).executeUpdate();
	}

	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
