package by.velichko.jonline.algorithmization.array;

import java.util.Arrays;

/*
Дана последовательность действительных чисел а1, а2,..., аn. Заменить все
ее члены, большие данного Z, этим числом. Подсчитать количество замен.
*/

public class Task2 {

	public static void main(String[] args) {

		double[] numbers = { 3.8, 6.4, 9.1, 0.1, -5.6, 12.8, -10.2, -15.6, -22.1, 7.3 };
		double z = 5.5;
		
		int numberOfReplacements = 0;
		
		System.out.println("Source array: " + Arrays.toString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > z) {
				numbers[i] = z;
				numberOfReplacements++;
			}
		}
		
		System.out.println("Results:      " + Arrays.toString(numbers));
		System.out.println("Number of replacements = " + numberOfReplacements);
	}

}
