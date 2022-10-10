package javaFundamentals;

import java.util.Scanner;

public class ForEachLoops {

	public static void main(String[] args) {

     System.out.println("********** case 1 **********");	
		String[] name = {"David", "Al", "Jasfer"};  
		for(String x : name) {		// can just add new value names in Array without adjusting the For Condition i.e. name.lenght
			System.out.println(x);
		}

		
     System.out.println("********** case 2 **********");	
		int[] number = {1,2,3};  
		for(int x : number) {		// can just add new value names in Array without adjusting the For Condition i.e. name.lenght
			System.out.println(x);
			break;
		}
		
	 System.out.println("********** case 3 **********");	
		String[] name3 = {"David", "Al", "RC", "Jasfer"};  
		for(String x : name3) {		
			if(x.equalsIgnoreCase("rc")) {
				System.out.println("We found " + x);
				//break;			//can be removed for FOR EACH loop
			}
		}

	 System.out.println("********** case 4 **********");	
		String[] name4 = {"David", "Al", "RC", "Jasfer"};  
		for(String x : name4) {		
			if(x.equalsIgnoreCase("rc")) {
				System.out.println("We found " + x);
				//break;
			}
			else {
				System.out.println(x);
			}
		}
		//will still need to print up to last Array(jasfer) SINCE NO BREAK
	
	

		
		
System.out.println(); 
System.out.println("********** CHALLENGE **********");	
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter 1st Number : "); int numA = s.nextInt();
		System.out.print("Enter 2nd Number : "); int numB = s.nextInt();
		System.out.print("Enter 3rd Number : "); int numC = s.nextInt();
		
		int[] numUserInput = {numA, numB, numC,};
		int grandTotal = 0;
		
		for (int sumtotal : numUserInput ) {
			grandTotal = grandTotal + sumtotal;
		}
		
		System.out.println("Sum of the 3 entered Numbers is : " + grandTotal);
	}

}
