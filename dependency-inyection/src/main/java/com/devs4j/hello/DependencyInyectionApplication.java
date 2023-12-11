package com.devs4j.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



import com.devs4j.hello.aop.TargetObject;


@SpringBootApplication
public class DependencyInyectionApplication {



    
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        TargetObject targetobject = context.getBean(TargetObject.class);
        targetobject.hello("Hola Mundo");
        targetobject.foo();
        
        
        
        // Si necesitas el bean LifeCycleBean, descomenta la siguiente línea
        // LifeCycleBean bean = context.getBean(LifeCycleBean.class);
    }
}
