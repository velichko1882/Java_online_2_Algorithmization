package by.velichko.jonline.algorithmization.arrayofarray;

import java.util.Random;

/*
Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму
матрицу и номера строк, в которых число 5 встречается три и более раз.
*/

public class Task11 {

	public static void main(String[] args) {
		
		int k = 10;
		int p = 20;
		
		int[][] numbers = new int[k][p];
		
		int stringCounter = 0;

		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				numbers[i][j] = rand.nextInt(15);
			}
		}
		
		System.out.println("The matrix:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}

		System.out.print("The strings which contain number 5 three times ahd more:");
		
		for (int i = 0; i < numbers.length; i++) {
			
			int count = 0;
			
			for (int j = 0; j < numbers[0].length; j++) {
				if (numbers[i][j] == 5) {
					count++;
				}
			}
			if (count > 3) {
				stringCounter++;
				System.out.print("  " + (i + 1));
			}
		}
		
		if (stringCounter == 0) {
			System.out.println("  absent");
		}

	}

}
