package by.velichko.jonline.algorithmization.decomposition;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если
сумма его цифр, возведенных в степень n, равна самому числу. Найти все числа
Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
*/

public class Task14 {

	public static void main(String[] args) {

		int k = 10000;

		findArmstrongNumbers(k);

	}

	public static int getNumberLength(int number) {

		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}

	public static int getSumExpDigits(int number) {

		int sum = 0;
		int exponent = getNumberLength(number);

		while (number > 0) {
			sum += Math.pow(number % 10, exponent);
			number /= 10;
		}

		return sum;
	}

	public static void findArmstrongNumbers(int border) {

		for (int i = 1; i <= border; i++) {
			
			int number = getSumExpDigits(i);
			
			if (number == i) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();

	}
}
