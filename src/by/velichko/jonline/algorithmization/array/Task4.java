package by.velichko.jonline.algorithmization.array;

/*
Даны действительные числа а1, а2,..., аn. Поменять местами
нибольший и наименьший элементы.
*/

public class Task4 {

	public static void main(String[] args) {

		double[] numbers = new double[] { 99.8, 8.1, 0.0, 9, -54.2, -8.9, 98, -1.2, 5, 14 };

		double max = numbers[0];
		double min = numbers[0];

		int indexMax = 0;
		int indexMin = 0;

		double temp;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				indexMax = i;
			}
			if (numbers[i] < min) {
				min = numbers[i];
				indexMin = i;
			}
		}

		System.out.println("Source array:");
		
		for (double d : numbers) {
			System.out.print(d + "  ");
		}
		System.out.println();

		temp = numbers[indexMax];
		numbers[indexMax] = numbers[indexMin];
		numbers[indexMin] = temp;

		System.out.println("Array with replacing max and min elements:");
		
		for (double d : numbers) {
			System.out.print(d + "  ");
		}
		System.out.println();

	}

}
