package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public class Car implements InitializingBean, DisposableBean{
public class Car{

	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void print() {
		System.out.println("Engine: " + engine.getModelyear());
	}
	
	//init and destroy by using spring interfaces
	
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("InitializingBean -- initailization method of bean");
//		
//	}
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("DisposableBean -- destroy method of bean");
//	}

	
	//creating own init and destroy and configuring in xml
	
	public void myInit() {
		System.out.println("initailization method of bean");
	}
	
	public void destroy() {
		System.out.println("destroy method of bean");
	}

}

