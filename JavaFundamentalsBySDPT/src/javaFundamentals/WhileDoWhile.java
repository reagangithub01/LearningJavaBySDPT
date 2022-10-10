package javaFundamentals;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {

//		int i = 0;
//		while(i < 5) {
//			System.out.println(i);
//			i++;
//		}
//			System.out.println("");
//		int s = 5;
//		do {
//			System.out.println(s);
//			s--;
//		}while(s>0);
		
		
//		Scanner q = new Scanner(System.in);
//		int l = 3;
//		String a;
//		
//		while(l > 0) {
//			System.out.print("Type your name: ");
//			a = q.nextLine();
//			
//			if(	a.equalsIgnoreCase("rc") || 
//				a.equalsIgnoreCase("rg") || 
//				a.equalsIgnoreCase("gian") || 
//				a.equalsIgnoreCase("g")
//				) break;
//			else	l--;
//		}
//		
//		if(l>0) System.out.print("Correct!");
//		else	System.out.print("Eh! wroooong!. Better luck next time.");

		Scanner search = new Scanner(System.in);
		
		System.out.print("Type Name: ");
		String toSearch = search.nextLine();
		
		String[] names = {"a","b","c","d","e"};
		int i = 0;
		
		while(i < names.length) {
			
			if(names[i].equalsIgnoreCase(toSearch)) {
				System.out.println("Found " + names[i]);
				break;
			}
			System.out.println(names[i]);
			i++; 
		}
		
		


		
	}

}
