package com.test03;

import org.springframework.stereotype.Component;

@Component("samsong") // 이 이름으로 bean 생성
public class SamsongTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("SamsongTV powerOn");

	}

	@Override
	public void powerOff() {
		System.out.println("SamsongTV powerOff");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsongTV volumeUp");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsongTv volumeDown");
	}

}
