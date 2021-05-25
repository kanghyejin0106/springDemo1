package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		String confLoc = "classpath:test.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		TestDAO testDAO = ctx.getBean("TestDAOImp", TestDAOImp.class);
		System.out.println("-----");
		//TestDAO testDAO = new TestDAOImp(); 코드가 없음에도 불구하고 실행가능 test.xml에서 주입해줘서
		testDAO.printMsg();
		System.out.println("-----");
	}

}
