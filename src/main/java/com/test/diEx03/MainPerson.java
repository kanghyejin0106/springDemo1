package com.test.diEx03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String confLoc = "classpath:person.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(confLoc);
		PersonInfo personInfo = ctx.getBean("personInfo", PersonInfo.class);
		personInfo.getPersonInfo();
		
		Person person = ctx.getBean("person2", Person.class);
		personInfo.setPerson(person);
		personInfo.getPersonInfo();
		
		ctx.close();
	}

}
