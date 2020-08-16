package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Developer dev = factory.getBean("dev", Developer.class);
		Engineer eng = factory.getBean("eng", Engineer.class);
		System.out.println(dev);
		System.out.println(eng);
	}
}
