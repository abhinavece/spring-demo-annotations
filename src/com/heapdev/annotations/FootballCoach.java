package com.heapdev.annotations;

import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Football:: Play like champ, run like Cheetah";
	}
	
	@Override
	public String getDailyFortune() {
		return "All the best for your match";
	}

}
