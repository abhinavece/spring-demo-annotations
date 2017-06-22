package com.heapdev.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getDailyFortune() {
		return "I wish you a very good luck.";
	}

}
