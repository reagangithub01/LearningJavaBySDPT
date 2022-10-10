package main;

//import mathematics.Arithmetic;	// import selected class
import mathematics.*; 				//all class in the package will be imported

public class Main {

	public static void main(String[] args) {
		
		Arithmetic a = new Arithmetic();	//instantiation
		Constant c = new Constant();		//instantiation
		
		//Arithmetic class from math package
		int sum 	= a.add(1,5);
		double diff = a.subtract(1.5, 0.5);
		int times 	= a.multiply(1, 10);
		int divide 	= a.divide(100, 2);
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(times);
		System.out.println(divide);
		
		//Constant class from math package
		//c.pi = 500; 				//this is possible due to it's NOT DECLARE FINAL in Constant class.
		System.out.println(c.pi);
		
		
		System.out.println(Arithmetic.add2(3, 9));	//NO NEED to instantiate Arithmetic due to making static the method add2
		
	}

}
