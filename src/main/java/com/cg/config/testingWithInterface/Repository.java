package com.cg.config.testingWithInterface;

import org.springframework.stereotype.Component;

@Component
public class Repository {	
	String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void printName() {
		System.out.println(name.toUpperCase());
	}

}
