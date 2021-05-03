package beans;

public class Singleton {
	
	public static Singleton s = null;
	
	private Singleton(){
		System.out.println("Singleton Constructor");
	}
	
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
	
	//restrict cloning of object, only way of creating object is by getInstance method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
