package com.heapdev.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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

}
