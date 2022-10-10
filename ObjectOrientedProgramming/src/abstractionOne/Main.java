package abstractionOne;

public class Main {

	public static void main(String[] args) {
		
		//ABSTRACT CLASS OR NOT CONCRETE IDEA
		//Animal a = new Animal();
		
		//CONCRETE IDEA
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.setName("Doggy");
		cat.showName();
		cat.makeSound();
		
		dog.setName("Catty");
		dog.showName();
		dog.makeSound();

	}

}
