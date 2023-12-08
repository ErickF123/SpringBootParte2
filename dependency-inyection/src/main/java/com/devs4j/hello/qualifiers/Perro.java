package com.devs4j.hello.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal {


	
	public Perro(@Value("Doggy") String nombre, @Value("12") Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

}
