package by.velichko.jonline.algorithmization.arrayofarray;

/*
Сформировать квадратную матрицу порядка N по правилу:
                  | I^2 - J^2 |
     A[I,J] = sin |-----------|
                  |     N     |
и подсчитать количество положительных элементов в ней.
*/

public class Task7 {

	public static void main(String[] args) {

		int n = 5;

		double[][] numbers = new double[n][n];

		int positiveCount = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				numbers[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);

				if (numbers[i][j] > 0) {
					positiveCount++;
				}
			}
		}

		System.out.println("The matrix:");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				System.out.printf("%12f", numbers[i][j]);
			}

			System.out.println();
		}

		System.out.println("The quantity of positive elements: " + positiveCount);

	}

}
