package javaFundamentals;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

//		for(int i = 0; i < 5; i++  ) {
//			System.out.println(i);
//		}
		
//		String[] names = {"David", "Alenere", "Jasfer", "Ace", "Patrick"};
//		System.out.print("Enter Name: ");
//		String search = s.nextLine();
//		for(int i = 0; i < names.length; i++  ) {			//names.lenght --> auto count the entered Array names
//				if(names[i].equalsIgnoreCase(search)) {
//					System.out.println(">>> Found " + names[i]);
//					break;
//				}
//				System.out.println(names[i]);
//		}
		
		String[] userId = {"RC1", "RC2", "RC3"};
		String[] password = {"pw1", "pw2", "pw3"};

// SOLUTION 1: by Reagan		
//		int counter = 3;
//		for(int tries = 0; tries < userId.length; tries++) {
//			
//			System.out.print("Enter User ID: ");
//			String uid = s.nextLine();
//			System.out.print("Enter Password: ");
//			String pass = s.nextLine();
//			
//			if(uid.equalsIgnoreCase(userId[0]) && pass.equalsIgnoreCase(password[0])) {
//				System.out.print("Welcome " + uid);
//				break;
//			}
//			else if(uid.equalsIgnoreCase(userId[1]) && pass.equalsIgnoreCase(password[1])) {
//				System.out.print("Welcome " + uid);
//				break;
//			}
//			else if(uid.equalsIgnoreCase(userId[2]) && pass.equalsIgnoreCase(password[2])) {
//				System.out.print("Welcome " + uid);
//				break;
//			}
//			else {
//				counter--;
//				System.out.println("User ID " + uid + " not found. " + "You have " + counter + " try left."); System.out.println("");
//			}
//		}
//		if (counter==0)	System.out.println("Account Blocked");

// SOLUTION 2: Java by SDPT Solution in Youtube
		System.out.print("Enter User ID: ");
		String uid = s.nextLine();
		System.out.print("Enter Password: ");
		String pass = s.nextLine();		
		
		boolean isExist = false;
		
		for(int i = 0; i < userId.length; i++) {
			if(uid.equalsIgnoreCase(userId[i]) && pass.equalsIgnoreCase(password[i]) ) {
				isExist = true;
				break;
			}
		}
		if(isExist) System.out.print("Welcome, " + uid);
		else 		System.out.print("Account Not Found ");
		
	}
}
