package com.mk.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class aspect {

	@Before("execution(* com.mk.transaction.TransactionBo.get(..))")
	public void beforeAspect(JoinPoint joinPoint) {
		//System.out.println("#####################\n\n\n########################");
	}
	//@Before("execution(* com.sun.jersey.api.core.HttpRequestContext.getEntity(..))")
	@Before("execution(* com.mk.transaction.TransactionBo.insert(..))")
	public void beforeAspectFilter(JoinPoint joinPoint) {
		
	}
}
