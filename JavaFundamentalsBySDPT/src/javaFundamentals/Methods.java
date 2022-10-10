package javaFundamentals;

public class Methods {

	//Global Variables -- Class Level
	static String section = "A"; 			//Should have STATIC modifiers
	static int num = 100;
	
	public static void main(String[] args) {
		
		sayHello(); // this will call sayHello METHOD
		printSection();
		printNum();
	}

	//Method 1
	static void sayHello() {
		System.out.println("Hello");
		String localVar = "This is a local variable"; // Local Variable within Method, Conditions, Loops, etc.
		System.out.println(localVar);
	}
	
	//Method 1
	static void printSection() {
		System.out.println("Printing " + "'" + section + "'" + " from global variable");
	}
	
	//Method 1
	static void printNum() {
		System.out.println("Printing " + "'" + num + "'" + " from global variable");	
	}
	
}
