package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Square {

	
	@Autowired
	@Qualifier("point1")
	private Points pointA;
	@Autowired
	@Qualifier("point2")
	private Points pointB;
//	private Points pointC;
//	private Points pointD;
	
//	Square(Points pointA, Points pointB, Points pointC, Points pointD){
//		this.pointA = pointA;
//		this.pointB = pointB;
//		this.pointC = pointC;
//		this.pointD = pointD;
//	}
	
	public void printSquareData() {
		System.out.println("*****Square Points*****");
		System.out.println("PointA: " + pointA.getX() +","+pointA.getY());
		System.out.println("PointB: " + pointB.getX() +","+pointB.getY());
//		System.out.println("PointC: " + pointC.getX() +","+pointC.getY());
//		System.out.println("PointD: " + pointD.getX() +","+pointD.getY());
	}
}
