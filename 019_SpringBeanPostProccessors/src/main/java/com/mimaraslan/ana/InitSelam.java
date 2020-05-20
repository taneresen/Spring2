package com.mimaraslan.ana;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSelam implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanAdi) throws BeansException {
		System.out.println("Baslatma Öncesi :" + beanAdi);
		return null;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanAdi) throws BeansException {
		System.out.println("Baslatmadan Sonrasi :" + beanAdi);
		return bean;
	}



}
