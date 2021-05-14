package Assignments.Day2;

public class SumOgDigitsFromStringMethod1 {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		int sum = 0;
		String replaced = text.replaceAll("\\D", "");
		char[] input = replaced.toCharArray();

		for (int i = 0; i < input.length; i++) {

			sum += Character.getNumericValue(input[i]);

		}

		System.out.println(sum);
	}
}
