package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		TV igTV = factory.getBean("igTV",IgTV.class);
		TV samsongTV = factory.getBean("samsong", SamsongTV.class);
		igTV.powerOn();
		igTV.powerOff();
		samsongTV.volumeDown();
		samsongTV.volumeUp();
		
	}
}
