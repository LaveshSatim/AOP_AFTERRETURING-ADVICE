package com.lavesh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({ "com.lavesh.bean", "com.lavesh.aspect" })
@EnableAspectJAutoProxy
public class Javaconfig {

}
