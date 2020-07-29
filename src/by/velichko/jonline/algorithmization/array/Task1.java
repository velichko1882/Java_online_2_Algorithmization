package by.velichko.jonline.algorithmization.array;

import java.util.Random;

/*
В массив А[N] занесены натуральные числа. Найти сумму тех элементов,
которые кратны данному К.
*/

public class Task1 {

	public static void main(String[] args) {

		int n = 10;
		int[] a = new int[n];
		int k = 2;

		int sum = 0;
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
			System.out.println("a[" + i + "] = " + a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}

		System.out.println("Sum of numbers, multiples k = " + sum);

	}

}