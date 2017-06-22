package com.heapdev.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		
		// Load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from container
		KabaddiCoach newBean = context.getBean("kabaddiCoach", KabaddiCoach.class );
//		KabaddiCoach newBean2 = context.getBean("kabaddiCoach", KabaddiCoach.class );

		
		//Call some method on the bean
		System.out.println(newBean.getDailyFortune());
		System.out.println(newBean.getDailyWorkout());
//		System.out.println("Comparing both the beans::: "+ (newBean==newBean2));
		
		//close the context
		context.close();
		
	}
}