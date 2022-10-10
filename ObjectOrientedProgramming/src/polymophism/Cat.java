package polymophism;

public class Cat extends Animal{
	
	Cat(){
		name = "Cat";
		age = 100;
	}
	
	void makeSound() {
		System.out.println("Sound: Meow!");
	}
}
