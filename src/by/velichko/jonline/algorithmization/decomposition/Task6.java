package by.velichko.jonline.algorithmization.decomposition;

/*
Написать метод (методы), проверяющий, являются ли данные три числа взаимно
простыми.
*/

public class Task6 {

	public static void main(String[] args) {

		int a = 17;
		int b = 12;
		int c = 113;

		System.out.println("Are numbers coprime integers: " + checkSimpleNumbers(a, b, c));

	}

	public static int gcd(int a, int b) {

		while (a != 0 && b != 0) {

			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}

		return a + b;
	}

	public static boolean checkSimpleNumbers(int a, int b, int c) {

		return (gcd(a, b) == 1 && gcd(b, c) == 1 && gcd(a, c) == 1) ? true : false;

	}
}
