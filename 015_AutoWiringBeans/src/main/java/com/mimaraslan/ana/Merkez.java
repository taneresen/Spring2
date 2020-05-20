package com.mimaraslan.ana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Calisan calisan = context.getBean("beanCalisan", Calisan.class);
		
		System.out.println(calisan);
		
		
	}

}
