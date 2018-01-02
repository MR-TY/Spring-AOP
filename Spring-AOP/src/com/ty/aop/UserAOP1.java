package com.ty.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class UserAOP1 {

	public void beforeMethod() {
		System.out.println("方法开始");
	}

	public void afterMethod() {
		System.out.println("方法结束之后");
	}
	
	public void aroundMethod(ProceedingJoinPoint joinPoint){
		System.out.println("开始");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("错误");
			e.printStackTrace();
		}
		System.out.println("方法结束");
	}
}
