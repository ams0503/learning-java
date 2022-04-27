package org.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.cars.Corolla;
import org.study.cars.Swift;
import org.study.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new	AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("corolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}
}
 