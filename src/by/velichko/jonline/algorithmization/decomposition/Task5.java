package by.velichko.jonline.algorithmization.decomposition;

import java.util.Random;

/*
Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но
больше всех других элементов).
*/

public class Task5 {

	public static void main(String[] args) {

		int n = 10;

		int[] numbers = new int[n];

		initArray(numbers);

		printArray("Source array:", numbers);

		System.out.println("Second max number: " + findSecondMax(numbers));

	}

	public static void initArray(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(200) - 100;
		}
	}

	public static void printArray(String message, int[] array) {

		System.out.println(message);

		for (int i : array) {
			System.out.print(i + "  ");
		}

		System.out.println();
	}

	public static int findSecondMax(int[] array) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int number : array) {

			if (number > max1) {
				max2 = max1;
				max1 = number;
			} else if (number > max2) {
				max2 = number;
			}

		}

		return max2;
	}

}
