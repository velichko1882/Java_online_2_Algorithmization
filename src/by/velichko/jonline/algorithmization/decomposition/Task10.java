package by.velichko.jonline.algorithmization.decomposition;

/*
Дано натуральное число N. Написать метод (методы) для формирования массива,
элементами которого являются цифры числа N.
*/

public class Task10 {

	public static void main(String[] args) {

		long n = 12;

		int[] numbers = getArrayFromNumber(n);

		printArray(numbers);

	}

	public static int getLength(long number) {

		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}

	public static int[] getArrayFromNumber(long number) {

		int n = getLength(number);
		int[] array = new int[n];

		int i = 0;
		while (number > 0) {
			array[i] = (int) number % 10;
			i++;
			number /= 10;
		}

		invertArray(array);

		return array;
	}

	public static void printArray(int[] array) {
		System.out.println("The array:");
		for (int e : array) {
			System.out.print(e + "  ");
		}
		System.out.println();
	}

	public static void invertArray(int[] array) {

		int n = array.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - 1 - i];
			array[n - 1 - i] = temp;
		}
	}
}
