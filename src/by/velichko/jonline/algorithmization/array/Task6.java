package by.velichko.jonline.algorithmization.array;

import java.util.Random;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел,
порядковые номера которых являются простыми числами.
*/

public class Task6 {

	public static void main(String[] args) {

		int n = 15;
		double[] numbers = new double[n];

		double sum = 0;

		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (rand.nextInt(1000) - 500) / 10D;
		}

		for (double d : numbers) {
			System.out.print(d + "  ");
		}
		System.out.println();

		for (int i = 2; i < numbers.length; i++) {
			
			int numberOfDivisors = 0;
			
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					numberOfDivisors++;
				}
			}
			
			if (numberOfDivisors == 1) {
				sum += numbers[i];
				System.out.println("a[" + i + "] = " + numbers[i]);
			}
		}
		
		System.out.println("Sum of numbers with simple index = " + sum);
	}

}
