package by.velichko.jonline.algorithmization.array;

import java.util.Random;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из
него каждый второй элемент (освободившиеся элементы заполнить нулями).
Примечание. Дополнительный массив не использовать.
*/

public class Task10 {

	public static void main(String[] args) {

		int n = 30;
		int[] numbers = new int[n];

		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100) - 50;
		}

		System.out.println("Source array:");
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = numbers.length - 1; i > 0; i--) {
			if (i % 2 == 1) {
				numbers[i] = 0;
				for (int j = i; j < numbers.length - 1; j++) {
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = 0;
				}
			}
		}

		System.out.println("Modified array:");
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
