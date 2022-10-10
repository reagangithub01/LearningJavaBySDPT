package javaFundamentals;

public class VariablesAndDatatypes {

	public static void main(String[] args) {

		char section = 'A';
		String name = "Reagan";
		boolean isTall = false;
		int num3 = 5;
		float num2 = 95.55f;
		double num1 = 95.55;
		
		
		name = "Cruz";
		isTall = true;
		num3 = 10;
		
		System.out.println("I'am " + name);
		System.out.println(isTall);
		System.out.println(num3);
		
		System.out.println("Hi, my name is " + name + "\n" + "I am " + num3 + " year old.\n" + "My GPA is " + num2 + "\n" + "My blood type is " + section);
		
		
	}

}
