package driver;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//using different xml for each POJO class
//		String files[] = new String[] {"resources/engine.xml", "resources/car.xml"};
		
		//using inner bean concent in one xml file
//		String files = "resources/car.xml";
		String files = "resources/carengine.xml";
		
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		
		Car c = (Car)ap.getBean("c");
		c.print();
	}
}
