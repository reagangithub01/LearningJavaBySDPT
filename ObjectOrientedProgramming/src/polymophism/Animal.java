package polymophism;

public class Animal {
	
	String name;
	int age;
	
	void makeSound() {
		System.out.println("Override this Animal Functions");
	}
	
	void showStatus() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
	}
}
