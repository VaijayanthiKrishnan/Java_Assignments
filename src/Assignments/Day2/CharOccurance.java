package Assignments.Day2;

public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str = "welcome to coimbatore";
		int count = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]=='o')
			{
				count++;
			}
		}System.out.println(count);
		
		
	}

}
