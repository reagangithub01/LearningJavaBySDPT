package mainEncapsulationInheritance;

public class ObjectOverloading {
	
	int userID;
	String name, password;	
	
	ObjectOverloading(int userID, String name, String password){
		this.userID		= userID;
		this.name		= name;
		this.password	= password;
	}
	
	ObjectOverloading(String name, String password){
		this.userID		= 0;
		this.name		= name;
		this.password	= password;
	}

}
