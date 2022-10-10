package mainEncapsulationInheritance;

public class Inheritance2Subclass extends Inheritance1Superclass {			// THIS CONSTRUCTOR CAN ALSO BE REMOVED --- IF IMPLICIT CONSTRUCTOR IS CREATED -- Inheritance1Superclass.CLASS

	int zip;
	
	Inheritance2Subclass (String name, String address, int age, int zip){	// int zip is OVERRIDING CONSTRUCTOR is the Constructor of Super
		super(name, address, age); 											// Inherit CONSTRUCTOR and arguments of Super or Parent Class
		this.zip 	= zip;
		
	}																		
	
	void basicInfoChild(){
		System.out.println("\nBelow is Sub/Child Class' additional Argument");
		System.out.println("Zip     : " + zip);
	}
	
	//OVERRIDING METHODS
	void basicInfo() {    		//method from Super Class
		super.basicInfo(); 		//this will call the codes/prints inside basicInfo method from Super Class
		System.out.println("This is override method");
	}
	
}
