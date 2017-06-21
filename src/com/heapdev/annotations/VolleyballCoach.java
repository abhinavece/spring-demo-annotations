package com.heapdev.annotations;

import org.springframework.stereotype.Component;

@Component("volleyballCoach")
public class VolleyballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "VolleyballCoach:: start playing anytime... anywhere !!";
	}

}
