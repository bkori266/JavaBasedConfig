package com.cg.domain;

import org.springframework.stereotype.Component;

@Component
public class Workers implements Company {

	public void work() {
		System.out.println("labour are working");
	}
}
