package by.velichko.jonline.algorithmization.arrayofarray;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых
первый элемент больше последнего.
*/

public class Task1 {

	public static void main(String[] args) {
		
		int[][] numbers = { { 58, -7,  25,  56,  98 },
						    { -6,  65,   4, -64,  1 },
						    {  9,  38, -82,  -5, 42 },
						    { 31, -76,   1,  55,  6 } };

		int count = 0;

		for (int j = 1; j < numbers[0].length; j += 2) {
			
			if (numbers[0][j] > numbers[numbers.length - 1][j]) {
				count++;
				
				System.out.println("Column " + j);
				for (int i = 0; i < numbers.length; i++) {
					System.out.printf("%5d\n", numbers[i][j]);
				}
			}
		}
		
		if (count == 0) {
			System.out.println("The columns are not exist");
		}
	}

}
