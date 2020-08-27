package by.velichko.jonline.algorithmization.sorting;

import java.util.Arrays;

/*
Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется
переставить числа в порядке возрастания. Делается это следующим образом. Пусть
a1, a2, ..., ai - упорядоченная последовательность, т.е. a1 <= a2 <=...<= an.
Берется следующее число ai+1 и вставляется в последовательность так, чтобы 
новая последовательность была тоже возрастающей. Процесс производится до тех
пор, пока все элементы от i+1 до n не будут перебраны. Примечание. Место 
помещения очередного элемента в отсортированную часть производить с помощью
двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/

public class Task5 {

	public static void main(String[] args) {

		int[] numbers = { -130, 21, 98, -98, 65, 87, 14, -8, 24, -12, 9, -5, -8 };
		
		System.out.println("Source array: " + Arrays.toString(numbers));
		
		
		for (int i = 0; i < numbers.length - 1; i++) {
			
			int indexToInsert = binarySearch(numbers, i, numbers[i + 1]);
			
			if (indexToInsert <= i) {
			
				for (int j = i + 1; j > indexToInsert; j--) {
					int temp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array with insertion sort: " + Arrays.toString(numbers));
		
	}

	public static int binarySearch(int[] array, int lastIndexSortPart, int number) {
		int low = 0;
		int high = lastIndexSortPart;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			int guess = array[mid];
			if (guess == number) {
				return mid;
			}
			if (guess > number) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		if (mid == high && number > array[high]) {
			return mid + 1;
		} else {
			return mid;
		}
	}

}
