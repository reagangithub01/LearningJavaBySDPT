package polymophism;

public class Dog extends Animal {
	
	Dog(){
		name = "Dog"; //this will override arguments of Animal super class
		age = 55;
	}
	
	void makeSound() {
		System.out.println("Sound: Arf!");
	}
}
