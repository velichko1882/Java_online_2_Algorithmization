package by.velichko.jonline.algorithmization.array;

import java.util.Random;

/*
Даны действительные числа а1,а2,...,аn. Найти

		max(a1 + a2n, a2 + a2n-1, ..., an + an+1).
*/

public class Task7 {

	public static void main(String[] args) {

		int n = 10;
		double[] numbers = new double[2 * n];

		double[] increasedNumbers = new double[n];

		double max;

		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (rand.nextInt(1000) - 500) / 10.0;
		}

		System.out.println("Source array:");
		for (double d : numbers) {
			System.out.print(d + "  ");
		}
		System.out.println();

		
		for (int i = 0; i < increasedNumbers.length; i++) {
			increasedNumbers[i] = numbers[i] + numbers[numbers.length - 1 - i];
		}

		System.out.println("Array of increased numbers:");
		for (double d : increasedNumbers) {
			System.out.print(d + "  ");
		}
		System.out.println();

		
		max = increasedNumbers[0];

		for (int i = 1; i < increasedNumbers.length; i++) {
			if (increasedNumbers[i] > max) {
				max = increasedNumbers[i];
			}
		}

		System.out.println("Max element: " + max);

	}

}
