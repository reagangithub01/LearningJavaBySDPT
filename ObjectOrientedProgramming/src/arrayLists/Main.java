package arrayLists;

import java.util.ArrayList;
//DECLARE 	ArrayList<dataType> identifier/varName = new ArrayList<dataType>();
//Example 	ArrayList<String> nameStudents = new ArrayList<String>();
//Note: 	ArrayList uses a NON-PRIMITIVE Data Type

// Primitive DT 		= int, float, double, char, boolean, byte 	--all colored violet. WITHOUT METHODS when adding "."(dot)
// non-Primitive DT		= String 									--colored black. WITH METHODS when adding "."(dot)

public class Main {

	public static void main(String[] args) {


//------WRAPPER CLASS -- wrap primitive data type to be used in Array List by CAPITALIZING declarations
//		Integer s;
//		Float f;
//		Double d;
//		Character dbl;
//		Boolean b;
//		Byte byt;
//		ArrayList<Integer> nameStudents = new ArrayList<Integer>();

//------EXERCISE 1 -- ADDING & READING
		
		// ADDING for PRIMITIVE Data Type
		ArrayList<String> nameStudents = new ArrayList<String>();
		nameStudents.add("Alenere");
		nameStudents.add("David");
		nameStudents.add("Jaymar");
		// READ
		String printName1 = nameStudents.get(0); 
		System.out.println(printName1);		
		System.out.println();
		
		// ADDING for NON-Primitive Data Type using Wrapper Class
		ArrayList<Integer> numberStudents = new ArrayList<Integer>();
		numberStudents.add(5);
		
		
		// ADD
		ArrayList<Student> classStudent = new ArrayList<Student>();	// Array List FOR CLASS
//		Student cs = new Student("David", "BSIT");
//		classStudent.add(cs);
		classStudent.add(new Student("David", "BSIT"));
		classStudent.add(new Student("Alenere", "BSIT"));
		classStudent.add(new Student("Jaymar", "BSIT"));
		// READ
		Student printName2 = classStudent.get(1); 
		printName2.introduce();						//print Alenere
		classStudent.get(2).introduce();			//print Jaymar
		System.out.println();		
		
	
//------EXERCISE 2 -- UPDATE VALUES
		//SYNTAX: identifier.set(index,value);
		System.out.println(nameStudents.get(0)); //Alenere from exercise 1 of Array List "String"
		nameStudents.set(0, "Emman");
		System.out.println(nameStudents.get(0)); //Emman
		
		classStudent.get(0).introduce();		//introduce David from exer1 of array list "Student"
		classStudent.set(0, new Student("Emman", "BSCS"));
		classStudent.get(0).introduce();		// Emman raplaced David

		System.out.println();

//------EXERCISE 3 -- DELETE VALUES
		//SYNTAX 1: identifier.remove(index) -- delete specific index
		//SYNTAX 2: identifier.clear(); -- clear Array List
		//RULE: deleting values in the index will AUTO-POPULATE from the succeeding NEXT values in the next index. 
		
		System.out.println(nameStudents.get(0));	//Now Emman which is index 0 from Exercise 2
		nameStudents.remove(0); 					//Remove Emman
		System.out.println(nameStudents.get(0));	//Index 0 will now have values moved from index 1 which David from exercise 1 of Array List "String"
		
		//from exercise 1 of Array List "Student"
		classStudent.get(0).introduce();			//currently Emman from exercise 2
		classStudent.remove(0);
		classStudent.get(0).introduce();			//now Alenere

		
//------EXERCISE 4 -- ARRAY LIST SIZE
		//SYNTAX 1: identifier.size();
		
		//from exercise 1 of Array List "String"
		System.out.println(nameStudents.size()); 	//now size 2 since remove Emman from Exercise 3
		
		//from exercise 1 of Array List "Student"	//now size 2 since remove Emman from Exercise 3
		System.out.println(classStudent.size());
		System.out.println();
		
		
		for(String x:nameStudents) {
			System.out.println(x);	
		}
		
		for(Student y:classStudent) {
			y.introduce();
		}
		
	}

}
