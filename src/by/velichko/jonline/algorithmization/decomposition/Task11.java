package by.velichko.jonline.algorithmization.decomposition;

/*
Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.
*/

public class Task11 {

	public static void main(String[] args) {

		long a = 10;
		long b = 1;

		compareNumbers(a, b);

	}

	public static int getLength(long number) {

		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}

	public static void compareNumbers(long a, long b) {

		int lengthA = getLength(a);
		int lengthB = getLength(b);

		if (lengthA == lengthB) {
			System.out.println("The numbers contain the same quantity of digits");
		} else {
			System.out.println("The number " + (lengthA > lengthB ? a : b) + " contains more digits");
		}
	}
}
