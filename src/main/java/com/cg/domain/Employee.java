package com.cg.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Employee implements Company {
	
	public Employee() {
		System.out.println("Object created");
	}
	
	public void work() {		
		System.out.println("Employee are working");
	}
	
	public void walk() {
		System.out.println("Employee Walking");
	}

}
