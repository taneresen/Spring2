package com.mimaraslan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextOlayTazeleyicisi implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("ContextRefreshedEvent(Context Olay Tazeleme)"+event.getTimestamp());
	}

}
