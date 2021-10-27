package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void email() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class Demo {

	public static void main(String[] args) {
		//Instantiating an Object
		Person person1 = new Person();
		
		// Define the properties
		person1.name = "Joe";
		person1.email = "joe@email.com";
		person1.phone = "3213213211";
		
		// Abstraction
		person1.walk();
		person1.email();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
	}

}
