package mainEncapsulationInheritance;

public class Encapsulation {

	private int userID;
	private String fullName, password;
	
	Encapsulation(int userID, String fullName, String password){
		this.userID		= userID;
		this.fullName	= fullName;
		this.password	= password;
	}

	
	Encapsulation(String fullName, String password){
		this.userID		= 0;
		this.fullName	= fullName;
		this.password	= password;
	}
	
	
	
	//Setter
	void setPassword(String password) {
		this.password = password;
		//System.out.println(password);
	}
	
	//Getter Return
	int getUserID() {
		return userID;
	}
	String getFullName() {
		return fullName;
	}
	String getPassword() {
		return password;
	}
	
	
	
}
