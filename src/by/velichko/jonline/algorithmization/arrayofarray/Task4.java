package by.velichko.jonline.algorithmization.arrayofarray;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n-четное):
          | 1   2   3   ...   n |
          | n  n-1 n-2  ...   1 |
          | 1   2   3   ...   n |
          | n  n-1 n-2  ...   1 |
          | .. ..  ..   ...  .. |
          | n  n-1 n-2  ...   1 |
*/

public class Task4 {

	public static void main(String[] args) {

		int n = 10;
		int[][] numbers = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i % 2 == 0) {
					numbers[i][j] = j + 1;
				} else {
					numbers[i][j] = n - j;
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
