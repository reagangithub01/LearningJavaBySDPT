package abstractionTwoInterface;

public class Bird implements Animal,  AirAnimal {		//LandAnimal (implements) can be removed since walk method already extended to AirAnimal

	public void makeSound() {				//from Animal INTERFACE
		System.out.println("CHIRP!");
	}
	
	public void walk() {					//from LandAnimal INTERFACE
		System.out.println("Birds can also WALK.");
	}
	
	public void fly() {						//from AirAnimal INTERFACE
		System.out.println("Birds can FLY.");
	}
}
