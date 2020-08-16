package com.test01;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BeanTest {

	private MyClass myClass;
	
	public BeanTest() {
		System.out.println("기본 생성자");
	}
	
	public BeanTest(Date date) {
		System.out.println("Date 받는 생성자 : " + date);
	}
	public BeanTest(MyClass myClass){
		this.myClass = myClass;
		System.out.println("MyClass 받는 생성자");
	}
	public void setMyClass(MyClass myClass) {
		this.myClass = myClass;
		System.out.println("setMyClass(MyClass myClass)");
	}
	
	public void setDate(Date date) {
		System.out.println("setDate(Date date) 호출! " + date);
	}
	
	public void setNumber(int num) {
		System.out.println("setNumber(int num) 호출 : "  + num);
	}
	
	public void setArray(String[] arr) {
		System.out.println("setArray(String[] arr) 호출");
		for(String s : arr) {
			System.out.println(s);
		}
	}
		
	public void setList(List<String> list) {
		System.out.println("List<String> list");
		System.out.println(list);
	}
	
	public void setSet(Set<String> set) {
		System.out.println("setSet<String> set");
		for(String s : set) {
			System.out.println(s);
		}
	}
	
	public void setMap(Map<String, String> map) {
		System.out.println(" setMap(Map<String, String> map) 호출");
//		Collection<String> values = map.values();
//		for(String value : values) {
//			System.out.println(value);
//		}
		System.out.println("key 값으로 꺼내오기");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
	
	public void setScore(List<Score> list) {
		System.out.println("setScore(List<Score> list) 호출");
		for(Score sc :list) {
			System.out.println(sc);
		}
	}
}
	
	

	
//	@Override
//	public String toString() {
//		return super.toString();
//	} toString안 하면 주소값 나옴

