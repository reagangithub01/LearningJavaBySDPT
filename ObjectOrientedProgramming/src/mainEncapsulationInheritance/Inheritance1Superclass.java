package mainEncapsulationInheritance;

public class Inheritance1Superclass {
		
	String name, address;
	int age;
	
	
//	Inheritance1Superclass(){			// EXPLICIT CONSTRUCTOR -- CONSTRUCTOR IN SUB-CLASS IS NOT REQUIRED. RARELY USED
//		
//	}
	
	Inheritance1Superclass (String name, String address, int age ){		//IMPLICIT CONSTRUCTOR since with ARGUMENTS
		this.name 	= name;
		this.address= address;
		this.age	= age;
	}
	
	void basicInfo() {
		System.out.println("Name    : " + name);
		System.out.println("Address : " + address);
		System.out.println("Age     : " + age);
		System.out.println();
	}
	
}
