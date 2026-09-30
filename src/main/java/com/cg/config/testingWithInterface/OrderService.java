package com.cg.config.testingWithInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class OrderService {

	//@Autowired
	Repository repository;
	//@Qualifier("creditcardPayment")
	private Payment payment;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void placeOrder(Payment payment) {
		this.payment=payment;
		System.out.println(this.payment.getClass());
		this.payment.pay();
		
	}
	
	
}
