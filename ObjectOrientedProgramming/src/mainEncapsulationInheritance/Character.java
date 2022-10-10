package mainEncapsulationInheritance;

public class Character {
	String name, dialog;
	int hp, mp, lvl;
	
	Character(String name, String dialog, int hp, int mp, int lvl){
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
		
	}
	
	void introduce() {
		System.out.println(name + ": " + dialog + ". I am " + name);
	}
	
	void talkTo(String firstName) {
		System.out.println("Hi there " + firstName);
	}
	
	void talkTo(Character x) {			//asking for object as arguments
		System.out.println(name + " : Hello, " + x.hp);
	}
	
	String talkToReturnType(Character x) {			//making as Return Type
		return name + " : Hello, " + x.mp;
	}
	
}
