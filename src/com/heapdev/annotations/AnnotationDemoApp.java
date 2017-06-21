package com.heapdev.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from Spring container
		Coach theBean = context.getBean("theSillyCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theBean.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
