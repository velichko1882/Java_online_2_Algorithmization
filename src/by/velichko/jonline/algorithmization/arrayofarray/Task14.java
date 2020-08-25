package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
в каждом столбце число единиц равно номеру столбца.
*/

public class Task14 {

	public static void main(String[] args) {

		Random rand = new Random();

		int m = rand.nextInt(15) + 5;
		int n = rand.nextInt(15) + 5;

		int[][] numbers = new int[m][n];

		for (int j = 0; j < n; j++) {
			
			for (int i = 0; i <= j && i < m; i++) {
				
				boolean isCorrect = false;
				while (!isCorrect) {
					int randomIndex = rand.nextInt(m);
					if (numbers[randomIndex][j] == 0) {
						numbers[randomIndex][j] = 1;
						isCorrect = true;
					}
				}
			}
		}

		System.out.println("The matrix " + m + "x" + n + ":");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

	}

}
