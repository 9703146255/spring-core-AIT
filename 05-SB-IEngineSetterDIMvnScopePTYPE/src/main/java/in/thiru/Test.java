package in.thiru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
		Car car1 = context.getBean(Car.class);
		
		Car car2 = context.getBean(Car.class);
		
		Car car3 = context.getBean(Car.class);
		
		Car car4 = context.getBean(Car.class);
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
		System.out.println(car4.hashCode());
		
		
		
		
		car1.drive();
		
		
		DieselEngine de1 = context.getBean(DieselEngine.class);
		DieselEngine de2 = context.getBean(DieselEngine.class);
		DieselEngine de3 = context.getBean(DieselEngine.class);
		System.out.println(de1.hashCode());
		System.out.println(de2.hashCode());
		System.out.println(de3.hashCode());
		
	}

}
