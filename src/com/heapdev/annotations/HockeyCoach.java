package com.heapdev.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hockeyCoach")
public class HockeyCoach implements Coach {

	private FortuneService fortuneService;
	
	public HockeyCoach() {
		System.out.println("HockeyCoach ===> Inside default costructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "HockeyCoach:: Play hockey instead cricket";
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		return "HockeyCoach = > :::" + fortuneService.getDailyFortune();
	}

}
