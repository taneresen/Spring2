package com.mimaraslan.ana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Calisan calisan = (Calisan) context.getBean("Calisan");
		
		System.out.println("Adi        	:" +calisan.getAdi());
		System.out.println("Soyadi     	:" +calisan.getSoyadi());
		System.out.println("Yasi    	:" +calisan.getYas());
		System.out.println("Mahallesi 	:" +calisan.getAdres().getMahalle());
		System.out.println("Semti 		:" +calisan.getAdres().getSemt());
		System.out.println("Sehiri 		:" +calisan.getAdres().getSehir());
	}

}
