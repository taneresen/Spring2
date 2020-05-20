package com.mimaraslan.ana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Personel personel = context.getBean("BeanPersonel", Personel.class);
		
		System.out.println(personel);
		
		Sehir sehir = context.getBean("BeanSehir", Sehir.class);
		
		System.out.println(sehir);
		
	}

}
