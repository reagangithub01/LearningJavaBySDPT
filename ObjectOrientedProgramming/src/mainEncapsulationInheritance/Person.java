package mainEncapsulationInheritance;

public class Person {

	String fullName;
	String address;
	int age;
	
	Person(String fullName, String address, int age){
		this.fullName = fullName;
		this.address = address;
		this.age = age;
		
		print(address);
		print(age);
//		print("Object " + fullName + " created");
//		print("Object " + address + " created");
//		print("Object " + age + " created");
		//System.out.println(age);
	}
	
	public void print(String toPrint){
		System.out.println(toPrint);
	}
	public void print(int toPrint){
		System.out.println(toPrint);
	}
}
