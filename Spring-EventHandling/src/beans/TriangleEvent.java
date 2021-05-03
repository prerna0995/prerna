package beans;

import org.springframework.context.ApplicationEvent;
@SuppressWarnings("serial")
public class TriangleEvent extends ApplicationEvent {

	public TriangleEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Event occured";
	}
}
