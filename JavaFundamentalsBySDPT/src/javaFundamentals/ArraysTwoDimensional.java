package javaFundamentals;

public class ArraysTwoDimensional {

	public static void main(String[] args) {
		
	System.out.println("\n ********** case 1 **********");		
		//int users[][] = new int[3][2]; 		//declaration WITHOUT values like Instantiation
		String users[][] = {
				{"David",	"david123"},
				{"Alenere",	"alenere123"},
				{"Hezel",	"hezel123"},
				{"Jaymar",	"jaymar123"}
		};
		System.out.println(users[2][0]); //Hezel
		//users[0][0] = "Ace";
		System.out.println(users[0][0]); //Ace instead of David
		
		System.out.println(users.length);   	//4 rows
		System.out.println(users[1].length); 	//2 columns of index 2 (Hezel)
	
	System.out.println("\n ********** case 2 **********");		
		
		for(int i=0; i < 5; i++) {
			
			for(int x=0; x < 5 ; x++) {
				System.out.println(i + " " + x);
			}
		System.out.println();
		}
	
	System.out.println("\n ********** case 3 **********");		
		
		int count[][] = {
				{1},
				{1,2},
				{1,2,3},
				{1,2,3,4},
				{1,2,3,4,5}
		};
		
		for(int row=0; row < count.length; row++) {
			
			for(int col=0; col < count[row].length; col++) {
				System.out.print(count[row][col]);
			}
			System.out.println();
		}
		
		
	System.out.println("\n ********** case 4 **********");		
		
		int num[][] = {
			{1,2,3,4,5},			
			{1,2,3,4},
			{1,2,3},
			{1,2},
			{1}
		};
		
		for(int row[] : num) {
			
			for(int info:row) {
			System.out.print(info);
			}
		
		System.out.println();	
		}
		
		
			
		
	}

}
