package com.preethi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Preethi Jayaprakash
 *
 */
@Entity
@Table(name="Person")
public class Person implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="personname")
	private String personName;
	
	@Column(name="address")
	private String personAddress;
	
	@Column(name="personCity")
	private String personCity;
	
	@Column(name="personPwd")
	private String personPwd;
	
	@Column(name="phoneNumber")
	private Float phoneNumber;
	
	

	

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public String getPersonPwd() {
		return personPwd;
	}
	public void setPersonPwd(String personPwd) {
		this.personPwd = personPwd;
	}
	public Float getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Float phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

