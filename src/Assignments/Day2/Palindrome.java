package Assignments.Day2;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String value = "madam";

		String revvalue = "";
		for (int i=value.length()-1;i>=0;i--) {
			revvalue+=value.charAt(i);
		}
		if(value.equals(revvalue)) {
			System.out.println("Palindrome");
		}
		
			else {
				System.out.println("Not a Palindrome");
		}
				
	}

}
