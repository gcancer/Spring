package com.test00;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test00/test.xml");
		
		//Test tt = (Test) factory.getBean("test");
		//tt.DropTheBeat("Yo~");
		
		TestImpl name1 = (TestImpl)factory.getBean("name1");
		System.out.println(name1);
		name1.DropTheBeat();
		TestImpl name2 = (TestImpl)factory.getBean("name2");
		System.out.println(name2);
		name2.DropTheBeat();
	}
}
