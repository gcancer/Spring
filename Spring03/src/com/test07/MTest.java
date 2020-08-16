package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		//IoC 컨테이너가 만들어질 때 (bean컨테이너가 만들어질 때) 안에 있는 객체를 생성한다.
		// Lazy-init=true로 설정하면 해당 Bean이 호출될 때 까지 만들지 않음
		System.out.println("Spring Bean Container 생성!");
		
		TV ig = factory.getBean("ig", TV.class);
		TV samsong = factory.getBean("samsong", SamsongTV.class);
		
		ig.powerOff();
		ig.powerOn();
		ig.volumeDown();
		ig.volumeUp();
		
		samsong.powerOff();
		samsong.powerOn();
		samsong.volumeDown();
		samsong.volumeUp();
	}
}
