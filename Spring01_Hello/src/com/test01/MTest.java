package com.test01;

public class MTest {
	public static void main(String[] args) {
		//클래스와 클래스가 결합된 형태 → 강결합
		MessageBean bean = new MessageBean();
		bean.sayHello("Spring");
	}
}
