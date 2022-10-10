package polymophism;

public class Main {

	public static void main(String[] args) {
		
//		Dog d = new Dog();	//instantiation
//		Cat c = new Cat();
//		d.makeSound(); //overriding makeSound method from Animal Class
//		c.makeSound();
		
		
		//POLYMORPHISM
		Animal a = new Dog();
		Animal b = new Cat();
		a.showStatus();
		a.makeSound();		// this will still call overridden method from Dog
		b.showStatus();
		b.makeSound();
		

	}

}
