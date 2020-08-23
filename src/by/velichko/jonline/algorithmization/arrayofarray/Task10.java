package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
*/

public class Task10 {

	public static void main(String[] args) {
		
		int n = 7;
		
		int[][] numbers = new int[n][n];
		
		int count = 0;

		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				numbers[i][j] = rand.nextInt(100) - 50;
			}
		}
		
		System.out.println("The matrix:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("The positive elements of the main diagonal:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i][i] > 0) {
				count++;
				System.out.print("  " + numbers[i][i]);
			}
		}
		
		if (count == 0) {
			System.out.print("  absent");
		}

	}

}
