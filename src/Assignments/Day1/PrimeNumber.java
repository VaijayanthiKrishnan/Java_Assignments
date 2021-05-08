package Assignments.Day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int Num = 13;
		boolean flag = false;
		for (int i = 2; i<(Num/2) ; i++) {
			
			if(Num%i == 0) {
				
				flag = true;
				break;
				}
			
		} 
		
		if(flag) {
			System.out.println("Not Prime number");
		}else {
			System.out.println("Prime number");
		}
		
	}

}
