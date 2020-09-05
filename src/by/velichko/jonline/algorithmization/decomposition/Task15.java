package by.velichko.jonline.algorithmization.decomposition;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
*/

public class Task15 {

	public static void main(String[] args) {

		int n = 6;

		findNumbers(n);

	}

	public static void findNumbers(int digit) {

		int from = (int) Math.pow(10, digit - 1);
		int to = (int) Math.pow(10, digit);

		for (int i = from; i < to; i++) {
			if (isIncreasingDigits(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isIncreasingDigits(int number) {

		boolean isIncrease = true;
		int[] digits = convertNumberToArray(number);

		for (int i = 0; i < digits.length - 1; i++) {
			if (digits[i + 1] <= digits[i]) {
				isIncrease = false;
				break;
			}
		}

		return isIncrease;
	}

	public static void invertArray(int[] array) {

		int n = array.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - 1 - i];
			array[n - 1 - i] = temp;
		}
	}

	public static int[] convertNumberToArray(int number) {

		int n = getLength(number);
		int[] array = new int[n];

		int i = 0;
		while (number > 0) {
			array[i] = number % 10;
			number /= 10;
			i++;
		}

		invertArray(array);

		return array;
	}

	public static int getLength(int number) {

		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}

}
