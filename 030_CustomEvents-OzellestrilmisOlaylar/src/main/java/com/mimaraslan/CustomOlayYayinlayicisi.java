package com.mimaraslan;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomOlayYayinlayicisi implements ApplicationEventPublisherAware{

	
	private ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
		
	}

	public void yayinla() {
		CustomOlay customOlay = new CustomOlay(this);
		applicationEventPublisher.publishEvent(customOlay);
		
	}
	
}
