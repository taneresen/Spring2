package com.mimaraslan;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("resource")
public class Merkez {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Ogrenci ogrenci = context.getBean("ogrenciBean", Ogrenci.class);
		
		System.out.println(ogrenci);
	
		
	}

}
