package com.heapdev.annotations;

import org.springframework.stereotype.Component;

@Component("hockeyCoach")
public class HockeyCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "HockeyCoach:: Play hockey instead cricket";
	}

}
