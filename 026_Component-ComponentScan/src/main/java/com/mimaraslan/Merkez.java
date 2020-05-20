package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.matematik.HesapMakinesi;

public class Merkez {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SprinBeanConfig.xml");

		HesapMakinesi hesapMakinesi = context.getBean("hesapMakinesiBeanComponent", HesapMakinesi.class);
		hesapMakinesi.sonuclariGetirYaz(12, 12);

	}

}
