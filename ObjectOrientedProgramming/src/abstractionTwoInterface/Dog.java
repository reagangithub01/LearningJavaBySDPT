package abstractionTwoInterface;

public class Dog implements Animal, LandAnimal {

	public void makeSound() {					//from Animal INTERFACE
		System.out.println("ARF!");
	}
	
	public void walk() {						//from LandAnimal INTERFACE
		System.out.println("Dogs can walk.");
	}
}
