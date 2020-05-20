package com.mimaraslan.ana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Selam selamNesnesi1 = context.getBean("selam", Selam.class);
		selamNesnesi1.setMesaj("Taner Esen");
		selamNesnesi1.goster();
		
		
		Selam selamNesnesi2 = context.getBean("selam", Selam.class);
		selamNesnesi2.setMesaj("Ayla Esen");
		selamNesnesi2.goster();
		
		
		selamNesnesi1.goster();
		
		
	}

}
