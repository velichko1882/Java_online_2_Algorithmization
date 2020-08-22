package by.velichko.jonline.algorithmization.arrayofarray;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n-четное):
          | 1   1   1   ...   1   1   1 |
          | 0   1   1   ...   1   1   0 |
          | 0   0   1   ...   1   0   0 |
          | .. ..  ..   ...  ..  ..  .. |
          | 0   1   1   ...   1   1   0 |
          | 1   1   1   ...   1   1   1 |
*/

public class Task6 {

	public static void main(String[] args) {

		int n = 10;
		int[][] numbers = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				
				if ((j >= i && j < n - i) || (j <= i && j >= n - i - 1)) {
					numbers[i][j] = 1;
				} else {
					numbers[i][j] = 0;
				}
			}
		}

		System.out.println("The matrix:");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				System.out.printf("%5d", numbers[i][j]);
			}

			System.out.println();
		}

	}

}
