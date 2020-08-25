package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;

/*
Найти наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class Task15 {

	public static void main(String[] args) {

		Random rand = new Random();

		int k = rand.nextInt(10) + 5;
		int p = rand.nextInt(10) + 5;

		int[][] numbers = new int[k][p];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = rand.nextInt(200) - 100;
			}
		}

		System.out.println("Source matrix " + k + "x" + p + ":");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}
		
		int maxElement = numbers[0][0];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] > maxElement) {
					maxElement = numbers[i][j];
				}
			}
		}
		
		System.out.println("The max element of matrix : " + maxElement);
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 !=0) {
					numbers[i][j] = maxElement;
				}
			}
		}
		
		System.out.println("Result matrix:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

		
	}

}
