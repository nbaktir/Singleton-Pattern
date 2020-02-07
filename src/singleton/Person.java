package singleton;

public class Person {

	String name;
	int age;

	private static Person instance;
	
	private Person() { //constructor

	}
	public static Person getInstance() {
		
		if(instance == null) { //it will create only one instance
			instance = new Person();
		}
		return instance;
	}
	public void display() {
		System.out.println("Name: "+name+" age: "+age);
	}
	
}
