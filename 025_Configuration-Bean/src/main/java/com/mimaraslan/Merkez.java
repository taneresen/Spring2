package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("resource")
public class Merkez {

	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(SpringBeanConfig.class);
		
		context.refresh();
		
		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		System.out.println(ogrenci.getSehir().getSehirAdi());
		System.out.println(ogrenci.getSehir().getPlakaNo());
		System.out.println(ogrenci.getAdi());
		System.out.println(ogrenci.getSoyadi());
		
		context.close();
	
	
		
	}

}
