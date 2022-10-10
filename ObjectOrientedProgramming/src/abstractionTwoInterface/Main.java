package abstractionTwoInterface;

public class Main {

	public static void main(String[] args) {

		//ABSTRACT CLASS OR NOT CONCRETE IDEA and should be removed
		//Animal a = new Animal(); 
		
		Bird b = new Bird();	//Animal a = new Animal is ONLY FOR INHERITANCE/POLYMORPHISM, not FOR INTERFACE
		Dog d = new Dog();
		Frog f = new Frog();
		
		b.makeSound();
		b.fly();
		b.walk();
		System.out.println();
		
		d.makeSound();
		d.walk();
		System.out.println();
		
		f.makeSound();
		f.swim();
		f.walk();
		
		
	}

}
