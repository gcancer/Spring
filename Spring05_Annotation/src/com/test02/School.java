package com.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {

	@Autowired // byType -> byName 순으로 탐색
	@Qualifier("ys") // 해당이름 가진 애들 연결시켜주세요, 두 개 이상은 불가능
	private Student student;
	private int grade;
	
	public School() {
		
	}
	public School(Student student, int grade) {
		this.student = student;
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return " student : " + student + " grade : " + grade;
	}
	
}
