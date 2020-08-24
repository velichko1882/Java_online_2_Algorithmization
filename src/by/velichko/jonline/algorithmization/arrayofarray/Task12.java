package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
*/

public class Task12 {

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

		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers[i].length; j++) {
				int minIndex = j;
				
				for (int e = j + 1; e < numbers[i].length; e++) {
					if (numbers[i][e] < numbers[i][minIndex]) {
						minIndex = e;
					}
				}
				
				int temp = numbers[i][j];
				numbers[i][j] = numbers[i][minIndex];
				numbers[i][minIndex] = temp;
			}
		}

		System.out.println("Sorted matrix by ascending of elements of string:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers[i].length; j++) {
				int maxIndex = j;
				
				for (int e = j + 1; e < numbers[i].length; e++) {
					if (numbers[i][e] > numbers[i][maxIndex]) {
						maxIndex = e;
					}
				}
				
				int temp = numbers[i][j];
				numbers[i][j] = numbers[i][maxIndex];
				numbers[i][maxIndex] = temp;
			}
		}

		System.out.println("Sorted matrix by descending of elements of string:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

	}

}
