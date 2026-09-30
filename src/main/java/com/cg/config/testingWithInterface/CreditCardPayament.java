package com.cg.config.testingWithInterface;

import org.springframework.stereotype.Component;


public class CreditCardPayament implements Payment {

	public void pay() {
		System.out.println("Payment done with Credit card");

	}

}
