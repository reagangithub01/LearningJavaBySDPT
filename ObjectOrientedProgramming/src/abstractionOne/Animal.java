package abstractionOne;

public abstract class Animal {
	
	String name;
	
	 abstract void makeSound();
	 
	 void showName() {
		 System.out.println("Name   : " + name);
	 }
	 
	 void setName(String name) {
		 this.name = name;
	 }

}
