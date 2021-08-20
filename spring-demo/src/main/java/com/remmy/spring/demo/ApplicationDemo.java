package com.remmy.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
		Hello hello = applicationContext.getBean(Hello.class);
		hello.hello();
	}
}
