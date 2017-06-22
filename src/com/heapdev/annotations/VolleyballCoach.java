package com.heapdev.annotations;

import org.springframework.stereotype.Component;

@Component("volleyballCoach")
public class VolleyballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "VolleyballCoach:: start playing anytime... anywhere !!";
	}
	
	@Override
	public String getDailyFortune() {
		return "All the best for your match";
	}

}
