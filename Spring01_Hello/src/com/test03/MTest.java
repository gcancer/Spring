package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//기존방식
		/* 1.
		 * Resource res = new FileSystemResource("src/com/test03/beans.xml");
		 * 2.
		 * Resource res = new ClassPathResource("com/test03/beans.xml");
		 * BeanFactory factory = new XmlBeanFactory(res);
		 */
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml"); 
		//ApplicationContext라는 객체를 만들건데 ~  xml의 경로를 읽어서(ClassPathXml) ApplicationContext객체를 만들거에요 ("")의 경로에서
		//beans.xml의 경로에 있는 bean을 읽어서 객체로 만들어줌 (메모리에 저장)
		//가져와서 사용하면 됨
		
		MessageBean english = (MessageBean) factory.getBean("bean01"); //getBean이 무슨 타입인지 모르므로  Object-> 명시적 형 변환
		english.sayHello("spring");
		
		MessageBean korean = (MessageBean) factory.getBean("bean02");
		korean.sayHello("스프링");
		
		/*
		 * BeanFactory <- ApplicationContext <- ClassPathXmlApplicationContext
		 * 
		 * 스프링의 ApplicationContext 객체는 스프링 컨테이너 인스턴스이다.
		 * 스프링은 ApplicationContext 인터페이스의 여러 객체를 제공한다.
		 * ClassPathXmlApplicationContext : 저장된 ClassPath에서 Xml에 파일을 읽어서 bean 생성
		 * 
		 *
		 */
	}
}
