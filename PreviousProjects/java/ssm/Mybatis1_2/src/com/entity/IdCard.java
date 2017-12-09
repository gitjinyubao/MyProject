package com.entity;


import org.springframework.stereotype.Component;

@Component
public class IdCard {
	private   int   id;
	private   String   idNumber;
	private   Person   person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "IdCard [id=" + id + ", idNumber=" + idNumber + ", person="
				+ person + "]";
	}
	public IdCard(int id, String idNumber, Person person) {
		super();
		this.id = id;
		this.idNumber = idNumber;
		this.person = person;
	}
	public IdCard() {
		super();
		// TODO Auto-generated constructor stub
	}
}
