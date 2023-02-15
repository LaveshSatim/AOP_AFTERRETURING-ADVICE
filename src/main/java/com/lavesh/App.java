package com.lavesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lavesh.bean.GenerateRandomNo;
import com.lavesh.config.Javaconfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);

		GenerateRandomNo randomNo = context.getBean(GenerateRandomNo.class);

		int i = randomNo.generate(100);

		System.out.println("generated no : " + i);
	}
}
