package programs;

import java.util.Scanner;

public class RepeateStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
		generateNewString(inputString);

	}

	private static void generateNewString(String inputString) {

		String outputString = "";
		for (int index = 0; index < inputString.length(); index++) {
			for (int repeateIndex = index; repeateIndex >= 0; repeateIndex--) {

				outputString = outputString + inputString.charAt(index);
			}

		}
		System.out.println("New String: " + outputString);
	}

}
