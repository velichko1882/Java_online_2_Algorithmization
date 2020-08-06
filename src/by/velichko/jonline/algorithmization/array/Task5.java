package by.velichko.jonline.algorithmization.array;

/*
Даны целые числа а1, а2,..., аn. Вывести на печать только те
числа, для которых аi > i.
*/

public class Task5 {

	public static void main(String[] args) {

		int[] numbers = { 5, 8, 98, -48, 54, -5, 2, 69, -6, 10 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > i) {
				System.out.print(numbers[i] + "  ");
			}
		}

	}

}
