package abstractionTwoInterface;

public class Frog implements Animal, WaterAnimal, LandAnimal { //can more INTERFACES. Should have EACH INTERFACES ADDED

	public void makeSound() {							//from Animal INTERFACE
		System.out.println("RIBBIT!");
	}
	
	public void swim() {								//from Water Animal INTERFACE
		System.out.println("Frogs can SWIM.");
	}
	
	public void walk() {								//from LandAnimal INTERFACE
		System.out.println("Frogs can also WALK.");
	}
}
