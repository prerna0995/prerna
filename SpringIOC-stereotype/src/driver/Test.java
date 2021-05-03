package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Square;
import beans.Triangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setter method with autowired
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Triangle t = (Triangle)ap.getBean(Triangle.class);
		t.printData();
		
		Square s = (Square)ap.getBean(Square.class);
		s.printSquareData();
	}

}
