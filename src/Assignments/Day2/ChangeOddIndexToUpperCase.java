package Assignments.Day2;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {

		String test = "vaijayanthi";

		char[] input1 = test.toCharArray();
		for (int i = 0; i < input1.length; i++) {
	
			if(i%2!=0) {
			
					input1[i]=Character.toUpperCase(input1[i]);
				
			
			}
			

		}

		System.out.println(input1);
		 
	}
	}


