package javaFundamentals;

public class MethodsChallenge {
	
	
	public static void main(String[] args) {
	
		int inputs[] = {1,2,3};
		int result = summation(inputs);
		System.out.println(result);
	}
	
		static int summation(int sum[]) {
			int total = 0;
			for(int count: sum) {
				total += count; //total = total + count
			}
			return total;	
		}

}
