package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
*/

public class Task9 {

	public static void main(String[] args) {

		int k = 7;
		int p = 20;
		
		int[][] numbers = new int[k][p];

		int maxSum = 0;
		int indexMax = 0;

		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				numbers[i][j] = rand.nextInt(100);
			}
		}
		
		System.out.println("The matrix:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}
		
		for (int j = 0; j < numbers[0].length; j++) {
			
			int sumColumn = 0;
			
			for (int i = 0; i < numbers.length; i++) {
				sumColumn += numbers[i][j];
			}
			System.out.println("Sum of elements of column " + (j + 1) + ": " + sumColumn);
			
			if (sumColumn > maxSum) {
				maxSum = sumColumn;
				indexMax = j;
			}
		}
		
		System.out.println("The maximum sum in column number " + (indexMax + 1));
	}

}
