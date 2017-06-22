package com.heapdev.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class KabaddiCoach implements Coach {
	
	@Autowired
	private FortuneService FortuneService;

	@Override
	public String getDailyWorkout() {
		return "Play Kabaddi Daily";
	}

	@Override
	public String getDailyFortune() {
		return FortuneService.getDailyFortune();
	}
	
	// Define init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("<<<<<<::::: doMyStartupStuff()");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println(">>>>>>:::: doMyCleanupStuff()");
	}

}
