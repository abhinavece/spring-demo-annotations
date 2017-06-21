package com.heapdev.annotations;

import org.springframework.stereotype.Component;

@Component("theSillyCoach")
public class TenisCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Play 2 hours daily in the morning.";
	}
	

}
