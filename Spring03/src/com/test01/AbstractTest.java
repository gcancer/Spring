package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class AbstractTest {
	
	public abstract String dayInfo();
	
	public static AbstractTest getInstance() {
		//singleton pattern : 메모리에 단 하나의 객체만 존재하게 만드는 것
		//싱글톤 패턴은 단 하나의 인스턴스를 생성해 사용하는 디자인 패턴이다.

		
		GregorianCalendar cal = new GregorianCalendar();
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case 1 : return new Sunday(); 			
		case 2 : return new Monday();
		case 3 : return new Tuesday();
		case 4 : return new Wednesday();
		case 5 : return new Thursday();
		case 6 : return new Friday();
		case 7 : return new Saturday();
		}
		return null;
		
		/*
		 * Singleton Registry
		 * - Spring이 직접 Singleton 형태의 Object를 만들고 관리하는 기능을 제공
		 * (Spring Bean Object는 내부적으로 Singleton registry를 만들어서 연동)
		 * 
		 */
	}
}
 