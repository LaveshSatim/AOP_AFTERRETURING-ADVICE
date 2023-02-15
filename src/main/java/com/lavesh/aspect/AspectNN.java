package com.lavesh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectNN {

	@AfterReturning(value = "within(com.lavesh.bean.*)", returning = "ret")
	public void check(JoinPoint joinPoint, Object ret) {

		if ((Integer) ret < 50) {
			throw new IllegalArgumentException("less than 50");
		}
	}
}
