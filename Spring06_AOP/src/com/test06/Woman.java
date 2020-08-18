package com.test06;

import org.springframework.stereotype.Component;

@Component("woman")
public class Woman implements Person {

	@Override
	public void classWork() {
		System.out.println("컴퓨터를 켜서 쇼핑 한다.");
	}

}
