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
public class Square implements Figure {
	
	@Value("${square.side}")
	private double side;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	
}
