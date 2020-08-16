package com.test06;

public class BeanFactory {
	//Factory Pattern : 객체를 만드는 곳이 다른 곳에 있다.

	Object getBean(String beanName) {
		
		if(beanName.equals("samsong")) {
			return new SamsongTV();
		} else if(beanName.equals("ig")) {
			return new IgTV();
		}
		
		return null;
	}
}
