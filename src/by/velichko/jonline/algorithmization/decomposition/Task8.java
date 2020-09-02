package by.velichko.jonline.algorithmization.decomposition;

/*
Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5];
D[4] + D[5] + D[6]. Пояснение. Составить метод (методы) для вычисления суммы трех
последовательно расположенных элементов массива с номерами от k до m.
*/

public class Task8 {

	public static void main(String[] args) {

		int[] numbers = { 87, 9, -41, 6, -2, 23, -14, -8, 0, 51 };
		int k = 1;
		int m = k + 2;

		System.out.printf("D[%d] + D[%d] + D[%d] = %d\n", k, k + 1, m, sum(numbers, k, m));
	}

	public static int sum(int[] array, int from, int to) {

		int sum = 0;

		for (int i = from; i <= to && i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}

}
