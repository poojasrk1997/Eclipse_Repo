package programs;

import java.util.Arrays;
import java.util.Scanner;

public class CarFineCalculator {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		String cars = s.nextLine();
		String dateString = s.nextLine();

		String[] car_no_string = cars.split(",");
		int[] car_no_array = Arrays.asList(car_no_string).stream().mapToInt(Integer::parseInt).toArray();
		int date = Integer.parseInt(dateString);
		calculateFine(car_no_array, date);
	}

	private static void calculateFine(int[] car_no_array, int date) {

		double calculatedFine = 0;

		String dateType = "";
		if (date % 2 == 0) {
			dateType = "even";
		} else {
			dateType = "odd";
		}

		for (int i = 0; i < car_no_array.length; i++) {

			if (dateType.equalsIgnoreCase("even") && car_no_array[i] % 2 != 0) {
				calculatedFine = calculatedFine + 250;
			} else if (dateType.equalsIgnoreCase("odd") && car_no_array[i] % 2 == 0) {
				calculatedFine = calculatedFine + 250;
			}

		}

		System.out.println("Calculated Fine: " + calculatedFine);

	}

}
