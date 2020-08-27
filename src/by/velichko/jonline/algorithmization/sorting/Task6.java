package by.velichko.jonline.algorithmization.sorting;

import java.util.Arrays;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
его по возрастанию. Делается это следующим образом: сравниваются два соседних
элемента ai и ai+1. Если ai <= ai+1, то продвигаются на один элемент вперед.
Если ai > ai+1, то производится перестановка и сдвигаются на один элемент
назад. Составить алгоритм этой сортировки.
*/

public class Task6 {

	public static void main(String[] args) {

		double[] numbers = { 54.2, 12.8, -98.4, 0.2, -5.9, -37.1, 62.8, 8, 0, -0.1, 47, 0.2 };

		System.out.println("Source array: " + Arrays.toString(numbers));

		
		for (int i = 0; i < numbers.length - 1; i++) {
			
			int j = i + 1;
			
			while ((j > 0) && (numbers[j - 1] > numbers[j])) {
				double temp = numbers[j - 1];
				numbers[j - 1] = numbers[j];
				numbers[j] = temp;
				j--;
			}
		}

		System.out.println("Sorted array with shell sort: " + Arrays.toString(numbers));
	}

}
