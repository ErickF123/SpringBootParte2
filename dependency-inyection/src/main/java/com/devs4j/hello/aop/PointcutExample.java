package com.devs4j.hello.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {
    
   // @Pointcut("execution(* com.devs4j.hello.aop.TargetObject.*(..))")
    //public void targetObjectMethods() {
    //}
	
	// @Pointcut("within(TargetObject)")
    //   public void targetObjectMethods() {
    //  }
	
	 @Pointcut("@annotation(Devs4jAnnotation)")
      public void targetObjectMethods() {
      }
}
