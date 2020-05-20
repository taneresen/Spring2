package com.mimaraslan;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("resource")
public class Merkez {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		/*
		 * Ogrenci ogrenci = context.getBean("ogrenciBean", Ogrenci.class);
		 * 
		 * System.out.println(ogrenci);
		 */
		
		
		Ders ders = context.getBean("dersBean", Ders.class);
		
		System.out.println("Adi     :    "+ders.getOgrenci().getAdi());
		System.out.println("SoyAdi  :    "+ders.getOgrenci().getSoyadi());
		System.out.println("Yasi    :    "+ders.getOgrenci().getYasi());
		System.out.println("Ders    :    "+ders.getDers());
		System.out.println("Not     :    "+ders.getPuan());
	
		
	}

}
