package com.test.diEx03;

public class PersonInfo {
	private Person person;
	
	public PersonInfo() {};
	public PersonInfo(Person person) {
		this.person = person;
	}
	public void getPersonInfo() {
		if(person != null) {
			System.out.println("name: "+person.getName());
			System.out.println("gender: "+person.getGender());
			System.out.println("age: "+person.getAge());
			System.out.println("id: "+person.getIdNo());
			System.out.println("---------");
		}
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
