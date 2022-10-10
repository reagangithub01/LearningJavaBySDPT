package enumerators;

public class Main {

	public static void main(String[] args) {

//------EXERCISE 3
		PHCurrency pha[] = new PHCurrency[4];
		pha[0] = PHCurrency.PISO; //1.00
		pha[1] = PHCurrency.LIMA; //5.00,Lima
		pha[2] = PHCurrency.SAMPU;//10.00
		pha[3] = PHCurrency.BENTE;//20.00
	//-----loop Option 1		
	//		for(int x=0; x<pha.length; x++) {
	//			System.out.println(pha[x].pesoValue);
	//		}
	//-----loop Option 2		
	//		for(PHCurrency x:pha) {
	//			System.out.println(x.pesoValue);
	//		}
	//-----loop Option 3
	//		double sum=0;
	//		for(PHCurrency y:pha) {
	//			sum = sum + y.pesoValue;	
	//		}
	//		System.out.println(sum);
	//-----loop Option 4
			for(PHCurrency y:pha) {
				System.out.println(y.name);
			}
			//TO DO: why result in console has null
			// null
			// Lima
			// null
			// null

		
		
//------EXERCISE 2		
//		PHCurrency ph = PHCurrency.SAMPU;		
//		System.out.println(ph.pesoValue);
		
	
		
//------EXERCISE 1		
//		AILevel ai = AILevel.MEDIUM; 	//LIKE DECLARING VARIABLE		
//		switch(ai){
//			case EASY:
//				System.out.println(ai);
//				break;
//			case MEDIUM:
//				System.out.println(ai);
//				break;
//			case HARD:
//				System.out.println(ai);
//				break;
//		}		
		
	}

}
