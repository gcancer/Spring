package com.test03;

import org.springframework.stereotype.Component;

@Component
public class IgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("IgTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("IgTV powerOff");
	}

	@Override
	public void volumeUp() {
		System.out.println("IgTV volumeUp");
	}

	@Override
	public void volumeDown() {
		System.out.println("IgTV volumeDown");
	}

}
