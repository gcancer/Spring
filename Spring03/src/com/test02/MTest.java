package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp we = factory.getBean("we", Emp.class); //Emp.class : 가지고 오면서 형변환 해주세요~ 
		Emp pa = (Emp) factory.getBean("pa");
		
		System.out.println(we);
		System.out.println(pa);
		
	}
}
