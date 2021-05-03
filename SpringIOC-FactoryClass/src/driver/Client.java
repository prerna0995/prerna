package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import factory.Car;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		//static method approach
//		Car c = (Car)ap.getBean("cf");
//		c.drive();
		
		//instance method approach
//		Car c = (Car)ap.getBean("c");
//		c.drive();
		
		//factory bean interface approach
		Car c = (Car)ap.getBean("cf");
		c.drive();
		
	}
}
