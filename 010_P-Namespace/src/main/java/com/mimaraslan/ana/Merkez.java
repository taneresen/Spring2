package com.mimaraslan.ana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenci");
		
		System.out.println("Adi         :" +ogrenci.getAdi());
		System.out.println("Soyadi      :" +ogrenci.getSoyadi());
		System.out.println("Numarasi    :" +ogrenci.getNumarasi());
		System.out.println("Universitesi :" +ogrenci.getUniversitesi().getKurumAdi());
		
		

	}

}
