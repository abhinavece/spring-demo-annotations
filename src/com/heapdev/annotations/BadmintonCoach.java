package com.heapdev.annotations;

import org.springframework.stereotype.Component;

@Component("badmintonSillyCoach")
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "BadmintonCoach:: Play indoor games daily.";
	}

	@Override
	public String getDailyFortune() {
		return "All the best for your match";
	}
}
