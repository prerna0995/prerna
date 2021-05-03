package driver;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import beans.Test;

public class Client {
	public static void main(String[] args) {
		
		//core container
//		Resource r = new ClassPathResource("resources/spring.xml");
//		BeanFactory b = new XmlBeanFactory(r);
		
		//J2EE container(add spring-expression lib also)
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		System.out.println("document valid...");
//		Test t = (Test)b.getBean("t");
		Test t = (Test)ap.getBean("t");
		t.print();
	}
}
