package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Triangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Triangle t = (Triangle)ap.getBean(Triangle.class);
		t.printData();
		
		System.out.println(ap.getMessage("hello", null, "Default Message", null));
	}

}
