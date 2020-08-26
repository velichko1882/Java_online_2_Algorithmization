package by.velichko.jonline.algorithmization.sorting;

import java.util.Arrays;

/*
Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и
ставиться на первое место, а первый - на место наибольщего. Затем, начиная
со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
*/

public class Task3 {

	public static void main(String[] args) {

		int[] numbers = { -65, -24, -14, -7, -2, 3, 8, 15, 39, 42, 87, 87, 99 };

		System.out.println("Source array: " + Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {

			int indexMax = i;

			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[j] > numbers[indexMax]) {
					indexMax = j;
				}
			}
			
			if (indexMax != i) {
				int temp = numbers[i];
				numbers[i] = numbers[indexMax];
				numbers[indexMax] = temp;
			}
		}

		System.out.println("Sorted array with selection sort: " + Arrays.toString(numbers));
	}

}
