package by.velichko.jonline.algorithmization.sorting;

import java.util.Arrays;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное
число k. Объединить их в один массив, включив второй массив между k-м и (k+1)-м
элементами первого, при этом не используя дополнительный массив.
*/

public class Task1 {

	public static void main(String[] args) {

		int[] arrayA = { 3, 7, -9, 0, 13, -2, 54, -87, 25, 4, -31 };
		int[] arrayB = { 25, 1, 42, -6, 95, -29, 8, -7, 63, -96, 31, 0, 78, 1, 3, -10 };

		int k = 8;

		int[] arrayC = new int[arrayA.length + arrayB.length];

		for (int i = 0; i < arrayC.length; i++) {
			if (i <= k) {
				arrayC[i] = arrayA[i];
			} else {
				if (i > k && i <= k + arrayB.length) {
					arrayC[i] = arrayB[i - k - 1];
				} else {
					arrayC[i] = arrayA[i - arrayB.length];
				}
			}
		}

		System.out.println("Array A: " + Arrays.toString(arrayA));
		System.out.println("Array B: " + Arrays.toString(arrayB));
		System.out.println("Array C: " + Arrays.toString(arrayC));

	}

}
