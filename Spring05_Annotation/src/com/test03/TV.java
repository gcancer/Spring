package com.test03;

public interface TV {

	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
	
	/*
	 * TV를 상속받은
IgTV, SamsongTV 만들고
applicationContext.xml에
<context:component-scan>을 사용하여 등록하고,
MTest에서 호출하되

	 */
}
