package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Personel personel = context.getBean("BeanPersonel", Personel.class);
		System.out.println(personel);
		
	}

}
