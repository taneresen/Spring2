package com.mimaraslan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		context.start(); // Ayaga kaldiriliyor
		
		Sozler sozler = context.getBean("sozlerBean",Sozler.class);
		sozler.ekranaYaz();
		
		context.refresh();
		
		
		
		context.stop();
		context.close();
		
		
		
	}

}
