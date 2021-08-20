package com.remmy.spring.demo;

import org.springframework.stereotype.Repository;

@Repository
public class Hello {
	public void hello() {
		System.out.println("Hello!");
	}
}
