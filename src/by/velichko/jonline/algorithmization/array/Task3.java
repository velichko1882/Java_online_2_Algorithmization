package by.velichko.jonline.algorithmization.array;

import java.util.Random;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать,
сколько в нем отрицательных, положительных и нулевых элементов.
*/

public class Task3 {

	public static void main(String[] args) {

		int n = 10;
		double[] numbers = new double[n];

		int positiveNumbers = 0;
		int negativeNumbers = 0;
		int zeroNumbers = 0;

		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (rand.nextInt(1000) - 500) / 10.0;
		}

		for (double d : numbers) {
			System.out.print(d + "  ");
		}
		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positiveNumbers++;
			} else {
				if (numbers[i] < 0) {
					negativeNumbers++;
				} else {
					zeroNumbers++;
				}
			}
		}

		System.out.println("Quantity of positive numbers: " + positiveNumbers);
		System.out.println("Quantity of negative numbers: " + negativeNumbers);
		System.out.println("Quantity of zero numbers: " + zeroNumbers);

	}

}
