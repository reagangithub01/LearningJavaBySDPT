package studentSubjectSimulation;

import java.util.Scanner;

public class MainStudentSimulationChallenge {

	
	public static void main(String[] args) {

		try (Scanner userInput = new Scanner(System.in)) {
			System.out.print("Enter First Name   :"); String firstName 	= userInput.nextLine();
			System.out.print("Enter Last Name    :"); String lastName 	= userInput.nextLine();
			System.out.print("Enter Course       :"); String course 	= userInput.nextLine();
			System.out.print("Enter Section      :"); String section 	= userInput.nextLine();
			System.out.print("Enter Year         :"); int year 			= userInput.nextInt();
			System.out.print("Enter Midterm Grade:"); double midGrade 	= userInput.nextDouble();
			System.out.print("Enter Final Grade  :"); double finGrade 	= userInput.nextDouble();
			
			Student s1 = new Student(firstName, lastName, year, course, section, midGrade, finGrade);
			
			s1.introduceSelf();
			s1.evaluateGrade();
			
		}
		
		
	}

}


/* REQUIREMENTS
Firstname, Lastname, Year, Course, Section, Midterm Grade, Final Grade
introduceSelf() --> Full Name, Course, Year and Section
evaluateGrade() --> (midgrade + finalgrade) / ave, = honor/passed/failed
standing: 
>100 - invalid grade
98-100 - with highest honor
95-97.99 - with high honor
90-94.99 - with honor
75-89.99 - passed
<75 - failed
*/