package com.devs4j.hello.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(2)
public class MyAspect2 {
	
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);
	
	
	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint joinPoint) {
		log.info("1 Before advice {}", joinPoint.getSignature().getName());
		log.info("1 Before advice {}",joinPoint.getSignature().getDeclaringTypeName());
		log.info("1 Before advice {}",joinPoint.getSignature().getModifiers());
		log.info("1 Before advice {}",joinPoint.getArgs());
		log.info("1 Before advice {}",Modifier.isPublic(joinPoint.getSignature().getModifiers()));
		log.info("1 Before advice {}");
		
	}
	

}
