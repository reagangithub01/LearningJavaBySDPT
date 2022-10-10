package mainEncapsulationInheritance;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter Full Name :"); String name 		= scan.nextLine();
//		System.out.print("Enter Address   :"); String address 	= scan.nextLine();
//		System.out.print("Enter Age       :"); int age 			= scan.nextInt();
//		Person p = new Person(name, address, age);
		
//		Person p = new Person("Me", "House", 19);
//		p.print("hello");
		
		
		//CALLING OBJECT METHODS
		// Objects:                  Name,    	Dialog, 	hp, 	mp, 	lvl
//		Character c = new Character("David", 	"Hello!", 	100, 	50, 	5);
//		Character c1 = new Character("Alenere", "Musta", 	100, 	50, 	5);
//		c.introduce();
//		c1.talkTo(c.name);
//		c1.talkTo(c1); 									// calling instantiated
//		System.out.println(c.talkToReturnType(c1));		// using return
		
		
		//ENCAPSULATION
//		Encapsulation ecap = new Encapsulation(9999,"Rachel C", "RC1234");	
//			ecap.setPassword("RC5678"); 				//Setter
//			//
//			System.out.println("User ID  : " + ecap.getUserID()); 	//Getter
//			System.out.println("Name     : " + ecap.getFullName());	
//			System.out.println("Password : " + ecap.getPassword());
	
		//OBJECT OVERLOADING
//		ObjectOverloading ol = new ObjectOverloading(999,"Gian C","GC1234");
//		ObjectOverloading ol2 = new ObjectOverloading("RC", "RC999");
//		
//		System.out.println(ol.userID);
//		System.out.println(ol2.userID);
//		
		
		//INHERITANCE - EXTENDS - SUPER
		Inheritance1Superclass parent = new Inheritance1Superclass("Rachel", "PH", 5);
		Inheritance2Subclass child = new Inheritance2Subclass("Gian", "NZ", 12, 12345);

		
		parent.basicInfo();
		child.basicInfo();			// can use the method from Parent Class basicInfo()
		child.basicInfoChild();
			
	}

}
