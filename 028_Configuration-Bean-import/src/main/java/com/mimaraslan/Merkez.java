package com.mimaraslan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mimaraslan.config.SpringBeanConfig;

public class Merkez {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBeanConfig.class);
		
		context.refresh();
		
		A aNEsnesi=context.getBean("beanA", A.class);
		aNEsnesi.yaz("Selamlar Abim Ben A");
		
		B bNesnesi=context.getBean("beanB", B.class);
		bNesnesi.yaz("Selam abim Ben B ");
		
		context.close();
	
	
		
	}

}
