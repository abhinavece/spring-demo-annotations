package com.heapdev.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from Spring container
		Coach theBean = context.getBean("theSillyCoach", Coach.class);
		Coach hCoach = context.getBean("hockeyCoach", Coach.class);
		Coach myBean = context.getBean("badmintonSillyCoach", Coach.class);
		Coach fBean = context.getBean("footballCoach", Coach.class);
		Coach vBean = context.getBean("volleyballCoach", Coach.class);
		Coach tBean = context.getBean("volleyballCoach", Coach.class);

		// call a method on the bean
		System.out.println(theBean.getDailyWorkout());
		System.out.println(hCoach.getDailyWorkout());
		System.out.println(myBean.getDailyWorkout());
		System.out.println(fBean.getDailyWorkout());
		System.out.println(hCoach.getDailyWorkout());
		System.out.println(vBean.getDailyWorkout());
		
		System.out.println(tBean.getDailyFortune());
		System.out.println(tBean.getDailyWorkout());
		
		System.out.println(hCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}