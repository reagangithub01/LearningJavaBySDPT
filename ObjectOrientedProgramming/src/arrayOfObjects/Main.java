package arrayOfObjects;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//------CHALLENGE
		try (Scanner s = new Scanner(System.in)) {
			
			System.out.print("How many number of students to register? "); int x = s.nextInt();
			s.nextLine();   //this to handle unable to enter inputs from users
			
			Student students[] = new Student[x];
			for(int i=0; i < students.length; i++) {
				System.out.print("Enter First Name : "); String fName = s.nextLine();
				System.out.print("Enter Last Name  : "); String lName = s.nextLine();
				System.out.print("Enter Course     : "); String course = s.nextLine();	
				students[i] = new Student(fName, lName, course);
			}
			for(Student studentInfo: students) {
				studentInfo.introduceSelf();
			}
		}
		
		
		
//------EXERCISE 1		
//		Employee employees[] = new Employee[3];
//		
//		employees[0] = new Employee("David", "Sdpt", "UI/UX");
//		employees[1] = new Employee("Alenere", "Sdpt", "Game Programmer");
//		employees[2] = new Employee("Emman", "Sdpt", "QA");
//		
//		for(Employee e:employees) {
//			e.introduceSelf();
//		}

	
	
	
	}
		
}
