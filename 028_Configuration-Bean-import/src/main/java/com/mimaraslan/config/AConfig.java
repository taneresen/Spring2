package com.mimaraslan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mimaraslan.A;

@Configuration
public class AConfig {
	
	@Bean(name = "beanA")
	public A yaz() {
		A a = new A();
		return a;
	}

}
