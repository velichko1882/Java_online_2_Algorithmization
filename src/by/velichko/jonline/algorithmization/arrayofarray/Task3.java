package by.velichko.jonline.algorithmization.arrayofarray;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

public class Task3 {

	public static void main(String[] args) {

		int[][] numbers = { {   8, -7,  56,  9 },
                            {  -6,  4, -64, 11 },
                            {   9, 38, -82, -5 },
                            { -76,  1,  55,  6 }, 
                            {  24, -8, -87,  8 } };

		int k = 3;
		int p = 2;
		
		
		System.out.print("row " + k + ":");
		for (int i = 0; i < numbers[k].length; i++) {
			System.out.print("  " + numbers[k][i]);
		}
		System.out.println();
		
		
		System.out.println("column " + p + ":");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%5d\n", numbers[i][p]);
		}
		
	}

}
