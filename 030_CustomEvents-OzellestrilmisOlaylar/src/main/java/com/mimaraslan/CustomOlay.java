package com.mimaraslan;

import org.springframework.context.ApplicationEvent;

;

public class CustomOlay extends ApplicationEvent{

	
	private static final long serialVersionUID = 1L;

	public CustomOlay(Object object) {
		super(object);
		
	}

	@Override
	public String toString() {
		return "CustomOlay [Özellestrilmis Olay]";
	}

	
	

	
	

}
