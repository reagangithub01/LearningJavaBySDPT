package javaFundamentals;

public class MethodsAndArgumentsParameters {

	/*  Syntax: modifiers returntype methodName(arguments) {
	 * 			//your codes
	 * 			return value;
	 * }
	 * 
	 * modifiers = static
	 * returntypes:
	 * 		void 	= return nothing
	 * 		int 	= return integer values
	 * 		String	= return char/string values
	 * 		boolean = return boolean
	 * 		float	= return float
	 * 		... data types
	 */
	
	public static void main(String[] args) {
		String say = "Hello";
		
		print(say);
		print("World");
		add(1,2);
		age("My age is ", 14);
		
		//RETURN KEYWORDS
		int sum = addReturn(2,2);
		System.out.println(sum);
		int adultAge = 13;
		boolean age = isLegalAge(adultAge);
		System.out.println(age);
		System.out.println(isLegalAge(23));
		
		//OVERLOADING METHODS
		System.out.println(overAdd(1,1));
		System.out.println(overAdd(1,1,3));
		
	}
		static void print(String word) {
			System.out.println(word);
		}
		static void add(int num1, int num2) {
			System.out.println(num1+num2);
		}
		static void age(String age, int num3) {
			System.out.println(age + num3);
		}
		
		//RETURN KEYWORDS
		static int addReturn(int num4, int num5) {
			return num4+num5;
		}
		static boolean isLegalAge(int age) {
			if (age >= 18) return true;
			else return false;
		}
	
	
		//OVERLOADING METHODS -- acceptable SAME methodName as long DIFFERENT parameters/arguments
		static int overAdd(int num6, int num7) {
			return num6+num7;
		}
		static int overAdd(int num6, int num7, int num8) {
			return num6+num7+num8;
		}

}
