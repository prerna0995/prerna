package factory;

import org.springframework.beans.factory.FactoryBean;

//by default CarFactory will create a singleton object
public class CarFactory implements FactoryBean<Object>{
	
	//static Factory method
//	private static String carName;
//
//	public static String getCarName() {
//		return carName;
//	}
//
//	public static void setCarName(String carName) {
//		CarFactory.carName = carName;
//	}
//	
//	public static Car getCar() throws Exception {
//		Car c = (Car)Class.forName(carName).newInstance(); 
//		return c;
//	}
	
	
	//instance Factory method
//	private String carName;
//
//	public String getCarName() {
//		return carName;
//	}
//
//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
//	
//	public Car getCar() throws Exception {
//		return (Car)Class.forName(getCarName()).newInstance();
//	}
	
	
	//FactoryBean Interface approach
	private String carName;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public Object getObject() throws Exception {
		Car c = (Car)Class.forName(carName).newInstance();
		return c;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
}
