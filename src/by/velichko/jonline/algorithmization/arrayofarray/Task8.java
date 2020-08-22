package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;
import java.util.Scanner;

/*
В числовой матрице поменять местами два любых столбца, т.е. все элементы одного
столбца поставить на соответствующие им позиции другого, а элементы второго переместить
в первый. Номера столбцов вводит пользователь с клавиатуры.
*/

public class Task8 {

	public static void main(String[] args) {

		int k = 7;
		int p = 9;
		
		int[][] numbers = new int[k][p];
		
		int changeColumn1;
		int changeColumn2;
		
		Random rand = new Random();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				numbers[i][j] = rand.nextInt(100) - 50;
			}
		}
		
		System.out.println("Source matrix:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}
		
		do {
			System.out.println("Please, enter two numbers of column, (from 0 to " + p + "):");
			System.out.print("column 1 >> ");
			while(!sc.hasNextInt()) {
				sc.nextLine();
			}
			changeColumn1 = sc.nextInt();
			sc.nextLine();
			System.out.print("column 2 >> ");
			while(!sc.hasNextInt()) {
				sc.nextLine();
			}
			changeColumn2 = sc.nextInt();
			sc.nextLine();
		} while (changeColumn1 < 0 || changeColumn1 >= p || 
				changeColumn2 < 0 || changeColumn2 >= p);
		
		for (int i = 0; i < numbers.length; i++) {
			int buffer = numbers[i][changeColumn2];
			numbers[i][changeColumn2] = numbers[i][changeColumn1];
			numbers[i][changeColumn1] = buffer;
		}

		System.out.println("Matrix after replace columns:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}
		
	}

}
