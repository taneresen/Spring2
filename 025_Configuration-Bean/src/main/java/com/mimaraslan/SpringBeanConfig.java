package com.mimaraslan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {
	
	@Bean
	public Sehir sehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Diyarbakir");
		sehir.setPlakaNo(21);
		return sehir;
	}
	
	@Bean
	public Ogrenci ogrenci() {
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Taner");
		ogrenci.setSoyadi("Esen");
		ogrenci.setSehir(sehir());
		return ogrenci;
		
	}

}
