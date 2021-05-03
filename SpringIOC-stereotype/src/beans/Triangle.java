package beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangle {

	//resource is same as autowired it works as byName	
	@Resource
	private Points pointA;
	@Resource
	private Points pointB;
	@Resource
	private Points pointC;
	
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
	
	public void printData() {
		System.out.println("*****Triangle Points*****");
		System.out.println("PointA: " + pointA.getX() +","+pointA.getY());
		System.out.println("PointB: " + pointB.getX() +","+pointB.getY());
		System.out.println("PointC: " + pointC.getX() +","+pointC.getY());
	}
}
