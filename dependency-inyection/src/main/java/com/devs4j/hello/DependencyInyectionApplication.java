package com.devs4j.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.devs4j.hello.autowire.AreaCalculatorService;
import com.devs4j.hello.profiles.EnviromentService;
import com.devs4j.hello.scopes.EjemploScopeService;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


@SpringBootApplication
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);
	
	
	@Bean
	public String getAplicationName() {
		
		return "iDevs4j rules";
		
	}

	public static void main(String[] args) {
		
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("10 < 20");
		log.info("Result{}  ", expression.getValue() );
		
		
		//ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		
		//AreaCalculatorService calculate = context.getBean(AreaCalculatorService.class);
		
		//log.info("Area total: ", calculate.calcAreas() );
		
	}

}
