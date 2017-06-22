package com.heapdev.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theSillyCoach")
public class TenisCoach implements Coach{
	private FortuneService fortuneService;
	
	@Autowired
	public TenisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Play 2 hours daily in the morning.";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	

}
