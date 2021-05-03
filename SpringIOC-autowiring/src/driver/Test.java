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
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/setter.xml");
		Triangle t = (Triangle)ap.getBean("t");
		t.printData();
		
		//constructor with autowired
//		ApplicationContext app = new ClassPathXmlApplicationContext("resources/constructor.xml");
//		Square sq = (Square)app.getBean("s");
//		sq.printSquareData();

		//autowired nnotations
		ApplicationContext a = new ClassPathXmlApplicationContext("resources/autowire_annotation.xml");
		Square s1 = (Square)a.getBean("s");
		s1.printSquareData();
		
	}

}
