package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;

/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
*/

public class Task13 {

	public static void main(String[] args) {

		int k = 10;
		int p = 20;

		int[][] numbers = new int[k][p];

		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = rand.nextInt(100) - 50;
			}
		}

		System.out.println("Source matrix:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

		for (int j = 0; j < numbers[0].length; j++) {
			boolean isSorted = false;

			while (!isSorted) {
				isSorted = true;
				
				for (int i = 1; i < numbers.length; i++) {
					
					if (numbers[i][j] < numbers[i - 1][j]) {
						int temp = numbers[i - 1][j];
						numbers[i - 1][j] = numbers[i][j];
						numbers[i][j] = temp;
						isSorted = false;
					}
				}
			}
		}

		System.out.println("Sorted matrix by ascending of elements of column:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

		for (int j = 0; j < numbers[0].length; j++) {
			boolean isSorted = false;

			while (!isSorted) {
				isSorted = true;
				
				for (int i = 1; i < numbers.length; i++) {
					
					if (numbers[i][j] > numbers[i - 1][j]) {
						int temp = numbers[i - 1][j];
						numbers[i - 1][j] = numbers[i][j];
						numbers[i][j] = temp;
						isSorted = false;
					}
				}
			}
		}

		System.out.println("Sorted matrix by descending of elements of column:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

	}

}
