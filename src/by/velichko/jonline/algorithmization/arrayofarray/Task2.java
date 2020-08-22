package by.velichko.jonline.algorithmization.arrayofarray;

/*
Дана квадратная матрица. Вывести на экран элементы,
стоящие на диагонали.
*/

public class Task2 {

	public static void main(String[] args) {

		int[][] numbers = { {   8, -7,  56,  9 },
                            {  -6,  4, -64, 11 },
                            {   9, 38, -82, -5 },
                            { -76,  1,  55,  6 } };

		System.out.print("The elements of main diagonal:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("  " + numbers[i][i]);
		}
		System.out.println();
		
		System.out.print("The elements of second diagonal:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("  " + numbers[numbers.length - 1 - i][i]);
		}
		System.out.println();
	}

}
