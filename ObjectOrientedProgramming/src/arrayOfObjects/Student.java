package arrayOfObjects;

public class Student {		
	
	/* CHALLENGE
	 * - user to input number of students to enter
	 * - enter firstName, LastName, Course
	 * - display student info entered
	 */

	String firstName, lastName, course;
	
	Student (String firstName, String lastName, String course){
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}
	
	void introduceSelf() {
		System.out.println("Full Name : " + firstName + " " + lastName);
		System.out.println("Course    : " + course);
		System.out.println();
	
	}
}
