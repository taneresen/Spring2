package com.mimaraslan.ana;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Cizim {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext(new
		 * String[]{"SpringBeansConfig.xml"});
		 */
		
		ClassPathResource classPathResource = new ClassPathResource("SpringBeansConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		
		
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
		

	}

}
