package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Singleton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Singleton s = (Singleton)ap.getBean("s");
		
		Singleton sig1 = (Singleton)ap.getBean("s1");
		
		Singleton sig2 = (Singleton)ap.getBean("s2");
		System.out.println(sig1==sig2);
	}

}
