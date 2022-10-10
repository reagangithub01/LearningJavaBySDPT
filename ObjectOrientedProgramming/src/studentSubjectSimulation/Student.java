package studentSubjectSimulation;

public class Student {
	
	String firstName, lastName, cource, section;
	int year;
	double midGrade, finGrade;
	
	Student(String firstName, String lastName, int year, String cource, String section, double midGrade, double finGrade){
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.cource = cource;
		this.section = section;
		this.midGrade = midGrade;
		this.finGrade = finGrade;	
	}
	
	void introduceSelf() {
		System.out.println("");
		
		System.out.println("Hello!\nMy Name is " + firstName + " " + lastName + ".");
		System.out.println("Course is "	+ cource + ".");
		System.out.println("Year is " 	+ year   + ".");
		System.out.println("Section is "+ section+ ".");
		
		System.out.println("");
	}
	
	void evaluateGrade() {
		
		double aveGrade = (midGrade + finGrade) / 2;
		
		if(aveGrade > 100.00 || aveGrade < 0.00) {
			System.out.println("Invalid Grade. Please double check.");
		}
		else if(aveGrade >=98.00 && aveGrade <=100.00){
			System.out.println("Your Average Grade is " + aveGrade +". With HIGHEST Honor");
		}
		else if (aveGrade >=95.00 && aveGrade <=97.99){
			System.out.println("Your Average Grade is " + aveGrade +". With HIGH Honor");
		}
		else if (aveGrade >=90.00 && aveGrade <=94.99){
			System.out.println("Your Average Grade is " + aveGrade +". With HONOR");
		}
		else if (aveGrade >=75.00 && aveGrade <=89.99){
			System.out.println("Your Average Grade is " + aveGrade +". PASSED");
		}
		else {
			System.out.println("Your Average Grade is " + aveGrade +". FAILED");
		}
		
	}

}
