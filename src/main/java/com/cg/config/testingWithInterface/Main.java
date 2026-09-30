package com.cg.config.testingWithInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
	String type="creditcardPayment";
	Payment payment=appContext.getBean(type,Payment.class);
	
	//System.out.println(payment.getClass());
	
	OrderService orders=appContext.getBean(OrderService.class);
	OrderService orders1=appContext.getBean(OrderService.class);
	
	orders.setStatus("Bipin");
	orders1.setStatus("Vijay");
	
	
	System.out.println(orders==orders1);
	orders.placeOrder(payment);
	
	System.out.println(orders.getStatus());
	System.out.println(orders1.getStatus());
	
	}
	
	
	
	
	}
