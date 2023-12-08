/**
 * 
 */
package com.devs4j.hello.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 */

@Component
public class Circle implements Figure {
	
	@Value("${circle.radius:1}")
	private double radious;


	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radious, 2);
	}

}
