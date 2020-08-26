package by.velichko.jonline.algorithmization.arrayofarray;

/*
Магическим квадратом порядка n называется квадратная матрица размера n x n,
составленная из чисел 1,2,3,...,n^2 так, что суммы по каждому столбцу, каждой
строке и каждой из двух больших диагоналей равны между собой. Построить такой
квадрат. Пример магического квадрата порядка 3:
           6 1 8
           7 5 3
           2 9 4
*/

public class Task16 {

	public static void main(String[] args) {

		int n = 15;

		int[][] numbers = new int[n][n];

		int num = 1;

		int i = 0;

		int j = n / 2;

		while (num <= n * n) {
			
			if (i < 0) {
				i = n - 1;
			}
			
			if (j >= n) {
				j = 0;
			}
			
			numbers[i][j] = num;
			
			if (num % n == 0) {
				i += 2;
				j--;
			}
			
			num++;
			i--;
			j++;
		}

		for (int[] array : numbers) {
			for (int number : array) {
				System.out.printf("%5d", number);
			}
			System.out.println();
		}
	}

}
