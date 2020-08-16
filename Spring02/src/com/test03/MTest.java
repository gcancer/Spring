package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Address lee = (Address) factory.getBean("lee");
		Address hong = (Address) factory.getBean("hong");
		
		System.out.println(lee);
		System.out.println(hong);
		
		((ClassPathXmlApplicationContext)factory).close();
		// Garbage Collector : heap영역에서 더 이상 사용되지 않는(변수와 연결되지 않은) 객체를 알아서 버려주는 기능
		// close로 임의로 닫아줄 수 있음.
		// java에서는 Garbage Collector을 임의로 건들 수 없음.
		
		//di : 의존 주입 - > spring이 객체 만들면서 값을 전달
		//ioc : 제어 역전 -> 객체 생성을  spring이 해준다.
	}
}
