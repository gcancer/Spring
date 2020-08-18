package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	//classWork 의 타입은 String 
	//before -> target - > afterthrowing -> afterReturning -> after
	@Before("execution(public * *(..))")
	public void before(JoinPoint join) {
		System.out.println("출석카드를 찍는다");
	}
	@After("execution(public * *(..))")
	public void after(JoinPoint join) {
		System.out.println("집에 간다");
	}
	@AfterThrowing("execution(public * *(..))")
	public void throwing(JoinPoint join) {
		System.out.println("쉬는 날이었다");
	}
	@AfterReturning(pointcut = "execution(public * *(..))", returning = "returnVal") //returning : return되는 값을 받아서 returnVal에 연결시켜줄거야
	public void returning(JoinPoint join, Object returnVal) { // Target에서 return되는 값을 받아서 사용할 수 있다
		System.out.println(returnVal + "공부하는 날이었다."); 
	}
}
