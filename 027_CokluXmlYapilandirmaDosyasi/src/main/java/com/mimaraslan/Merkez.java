package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.müsteri.Müsteri;

public class Merkez {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Müsteri müsteri = context.getBean("BeanMüsteri", Müsteri.class);
		
		System.out.println("Adi          :"+müsteri.getAdi());
		System.out.println("Soyadi       :"+müsteri.getSoyadi());
		System.out.println("Telefonu     :"+müsteri.getTelNo());
		System.out.println("Adres        :"+müsteri.getAdres().getAdres());
		
		
		
		
		
	
	
		
	}

}
