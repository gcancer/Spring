package com.test02;

public class MTest {

	public static void main(String[] args) {
		//인터페이스를 사용하여 결합도를 낮췄다. -> 약결합
		MessageBean bean01 = new MessageBeanEn();
		bean01.sayHello("Spring");
		
		MessageBean bean02 = new MessageBeanKo();
		bean02.sayHello("스프링");
	}
}
