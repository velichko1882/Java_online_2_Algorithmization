package by.velichko.jonline.algorithmization.decomposition;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только
нечетные цифры. Определить также, сколько четных цифр в найденной сумме.
Для решения задачи использовать декомпозицию.
*/

public class Task16 {

	public static void main(String[] args) {

		int n = 4;

		int sum = sumOddDigitNumbers(n);

		System.out.println("The sum of " + n + "-digits numbers with odd digits: " + sum);

		System.out.println("This sum includes " + countEvenDigit(sum) + " even digits");
	}

	public static int getNumberLength(int number) {

		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
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

		int n = getNumberLength(number);
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

	public static boolean isOddDigits(int number) {

		int[] digits = convertNumberToArray(number);
		boolean isOdd = true;

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] % 2 == 0) {
				isOdd = false;
				break;
			}
		}
		return isOdd;
	}

	public static int sumOddDigitNumbers(int digit) {

		int sum = 0;
		int from = (int) Math.pow(10, digit - 1);
		int to = (int) Math.pow(10, digit);

		for (int i = from; i < to; i++) {
			if (isOddDigits(i)) {
				System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}

	public static int countEvenDigit(int number) {

		int count = 0;
		int[] digits = convertNumberToArray(number);

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
