package com.ty.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Scope(value = "singleton")
public class UserAOP {
	/**
	 * 
	* @Function: UserAOP.java
	* @Description: 
	*1.第一颗*:表示返回的类型
	*2.第二颗*:表示：执行所有的方法
	*3 ..：表示所有的参数
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: water
	* @date: 2018年1月2日 下午1:50:24 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年1月2日       water           v1.0.0               修改原因
	 */
	@Pointcut(value = "execution(* com.ty.dao.UserDAO.*(..))")
	public void PointOfCut() {
	}

	@Before(value = "PointOfCut()")
	public void beforeMethod() {
		System.out.println("方法开始");
	}

	@After(value = "PointOfCut()")
	public void afterMethod() {
		System.out.println("方法结束之后");
	}
	
	@Around(value="PointOfCut()")
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
