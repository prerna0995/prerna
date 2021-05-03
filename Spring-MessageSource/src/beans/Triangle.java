package beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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
	
	@Autowired
	private MessageSource messageSource;
	
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
		System.out.println(this.messageSource.getMessage("triangle.entry", null, "Default Triangle", null));
//		System.out.println("PointA: " + pointA.getX() +","+pointA.getY());
//		System.out.println("PointB: " + pointB.getX() +","+pointB.getY());
//		System.out.println("PointC: " + pointC.getX() +","+pointC.getY());
		System.out.println(this.messageSource.getMessage("triangle.pointA", new Object[] {pointA.getX(), pointA.getY()}, "Default PointA", null));
		System.out.println(this.messageSource.getMessage("triangle.pointB", new Object[] {pointB.getX(), pointB.getY()}, "Default PointC", null));
		System.out.println(this.messageSource.getMessage("triangle.pointC", new Object[] {pointC.getX(), pointC.getY()}, "Default PointC", null));
	}
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
