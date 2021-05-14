package Assignments.Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length() == text2.length()) {
			
			char[] input1 =text1.toCharArray();
			char[] input2 =text2.toCharArray();
			Arrays.sort(input1);
			Arrays.sort(input2);
					
			if(Arrays.equals(input1, input2))
			{
				System.out.println("The given strings are Anagram");
			}
			else
			{
				System.out.println("The given strings are not a Anagram");
				
			}
			
		}
}
}