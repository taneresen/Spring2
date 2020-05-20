package com.mimaraslan.ana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"SpringBeansConfig.xml"});
		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		ucgen.ciz();
		

	}

}
