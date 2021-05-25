package com.test.diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyGetSum myGetSum = new MyGetSum();
		
		myGetSum.setGetsum(new GetSum());
		myGetSum.setA(10);
		myGetSum.setB(100);
		myGetSum.sum();*/
		
		//with spring xml file
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:getSum.xml");
		MyGetSum mygetSum = ctx.getBean("myGetSum", MyGetSum.class);
		mygetSum.sum();
		
	}

}
