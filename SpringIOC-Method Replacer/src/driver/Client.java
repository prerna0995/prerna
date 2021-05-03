package driver;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank b = (Bank)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		b.withdraw();
		b.deposit();
		b.calculateInterest();
	}
}
