package by.velichko.jonline.algorithmization.decomposition;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
*/

public class Task17 {

	public static void main(String[] args) {

		int number = 1457895245;

		System.out.println("Number of operations: " + countSubtractions(number));

	}

	public static int getSumDigits(int number) {

		int sum = 0;

		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static int countSubtractions(int number) {

		int count = 0;

		while (number > 0) {
			number -= getSumDigits(number);
			count++;
		}
		return count;
	}
}
