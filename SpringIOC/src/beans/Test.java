package beans;

public class Test {
	private String name;
	private int age;
	private String email;
	
	public Test(){
		System.out.println("Test.......");
	}
	
	public Test(String name) {
		this.name = name;
	}
	
	public Test(int age) {
		this.age = age;
	}
	
	public Test(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public void print() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Email: " + getEmail());
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getEmail() {
		return email;
	}

//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	
	

}
