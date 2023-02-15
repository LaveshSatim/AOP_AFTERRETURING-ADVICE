package com.lavesh.bean;

import java.security.SecureRandom;

import org.springframework.stereotype.Component;

@Component
public class GenerateRandomNo {

	public int generate(int no) {

		return new SecureRandom().nextInt(no);
	}
}
