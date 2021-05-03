package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Square {
	
	@Autowired
	private Points pointA;
	@Autowired
	private Points pointB;
	@Autowired
	private Points pointC;
	@Autowired
	private Points pointD;
	
	public Points getPointA() {
		return pointA;
	}
	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	public Points getPointB() {
		return pointB;
	}
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	public Points getPointC() {
		return pointC;
	}
	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}	
	public Points getPointD() {
		return pointD;
	}
	public void setPointD(Points pointD) {
		this.pointD = pointD;
	}
	public void printSquareData() {
		System.out.println("*****Square Points*****");
		System.out.println("PointA: " + pointA.getX() +","+pointA.getY());
		System.out.println("PointB: " + pointB.getX() +","+pointB.getY());
		System.out.println("PointC: " + pointC.getX() +","+pointC.getY());
		System.out.println("PointD: " + pointD.getX() +","+pointD.getY());
	}
}