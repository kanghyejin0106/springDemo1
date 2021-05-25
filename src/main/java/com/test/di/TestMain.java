package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		String confLoc = "classpath:test.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		TestDAO testDAO = ctx.getBean("TestDAOImp", TestDAOImp.class);
		System.out.println("-----");
		//TestDAO testDAO = new TestDAOImp(); �ڵ尡 �������� �ұ��ϰ� ���డ�� test.xml���� �������༭
		testDAO.printMsg();
		System.out.println("-----");
	}

}
