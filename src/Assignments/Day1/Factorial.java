package Assignments.Day1;

public class Factorial {

	public static void main(String[] args) {
		
		int input = 10;
		int fact = 1;
		
		for(int i=1;i<=input;i++) {
			
			fact = i*fact;
		}
		
		System.out.println("The Factorial of "+input +" is "+fact);
	}
}
