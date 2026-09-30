package com.cg.config.testingWithInterface;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.cg.config.testingWithInterface")
public class AppConfig {
	
	@Bean
	public CreditCardPayament creditcardPayment() {
		return new CreditCardPayament();
	}
	
	
	@Bean
	//@Primary
	public UPIPayment upiPayment() {
		return new UPIPayment();
	}

//	@Bean
//	public Repository reposiroty() {
//		return new Repository();
//	}
//	
	@Bean
	@Scope("prototype")
	public OrderService orderService() {
		return new OrderService();
	}
}
