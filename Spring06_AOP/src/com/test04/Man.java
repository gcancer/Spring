package com.test04;

public class Man implements Person {

	@Override
	public String classWork() {
		System.out.println("컴퓨터를 켜서 축구 본다.");
		String s = null;
		s.length(); // 이렇게 예외 발생시킬 수 있음.
		return "Spring";
	}

}
