package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/address.xml");
		
		Address ys = (Address) factory.getBean("ys");
		Address je = (Address) factory.getBean("je");
		Address jy = (Address) factory.getBean("jy");

		System.out.println(ys.toString() + je.toString() + jy.toString()); //
		//System.out.println(ys + je + jy); -> 객체 타입에 + 라는건 선언이 되어있지 않음 때문에 오류가 남
	}
}
