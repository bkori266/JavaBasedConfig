package com.cg.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp=context.getBean(Employee.class);
		Employee emp1=context.getBean(Employee.class);
//		Workers work=context.getBean(Workers.class);
		emp.work();
		emp1.work();
//		Company comp=context.getBean(Company.class);
//		comp.work();	
		
			
	}

}
