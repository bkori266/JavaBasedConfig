package com.cg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.domain")
public class AppConfig {	
//  Usually the bean name is method name
//	@Bean(name="Desk")

	
	/**
	@Bean
	@Scope(value="prototype")
	public Employee employee() {
		return new Employee();
	}
	
	@Bean
	@Scope(value="prototype")
	public Workers workers() {
		return new Workers();
	}
	
	
	*/
}
