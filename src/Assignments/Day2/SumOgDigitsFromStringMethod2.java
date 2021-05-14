package Assignments.Day2;

public class SumOgDigitsFromStringMethod2 {
	
	public static void main(String[] args) {
		
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] input = text.toCharArray();
		
		for (int i = 0; i < input.length; i++) {
			
			if(Character.isDigit(input[i]))
			{
				sum+=Character.getNumericValue(input[i]);
			}
		}
		System.out.println(sum);
	}

}
