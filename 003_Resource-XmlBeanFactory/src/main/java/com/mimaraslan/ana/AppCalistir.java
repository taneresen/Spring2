package com.mimaraslan.ana;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCalistir {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"SpringBeansConfig.xml"});
	    
		Araba araba = (Araba) context.getBean("araba");
		
		araba.hareketeGec();
	    
	
		

	}

}
