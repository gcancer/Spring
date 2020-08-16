package com.test01;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		//Class생성하면서 setter를 호출함. 
		//순차적으로 돌기 때문에 호출하는 순서도 의미 없음.
		MyClass my = factory.getBean("myClass", MyClass.class);
		my.prn();
		
		Date date = (Date) factory.getBean("date");
		System.out.println("Date : " + date);
		BeanTest test02 = factory.getBean("test02", BeanTest.class);
		BeanTest test01 = factory.getBean("test01", BeanTest.class);
		BeanTest bt = factory.getBean("beanTest", BeanTest.class);
		
	}
}
