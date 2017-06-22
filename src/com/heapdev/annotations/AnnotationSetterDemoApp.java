package com.heapdev.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSetterDemoApp {

	public static void main(String[] args) {
		
		// Read Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from Spring container
		Coach hCoach = context.getBean("hockeyCoach", Coach.class);

		// call a method on the bean
		System.out.println(hCoach.getDailyWorkout());		
		System.out.println(hCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
