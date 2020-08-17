package com.test02;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		MyClass myClass = (MyClass)factory.getBean("myClass");
		myClass.prn();
		
		Date date = (Date)factory.getBean("date");
		System.out.println("오늘의 날짜 :" + date);
		
		BeanTest beanTest = (BeanTest)factory.getBean("beanTest");
		
		
	}
}
