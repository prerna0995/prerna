package driver;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import beans.Car;

public class Client {
	public static void main(String[] args) {

		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		ap.registerShutdownHook();
		System.out.println("document valid...");
		Car c = (Car)ap.getBean("c");
		c.print();
	}
}
