package by.velichko.jonline.algorithmization.sorting;

import java.util.Arrays;

/*
Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется
переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
ai и ai+1.  Если ai > ai+1, то делается перестановка. Так продолжается до тех пор,
пока все элементы не станут расположены в порядке возрастания. Составить алгоритм
сортировки, подсчитывая при этом количество перестановок.
*/

public class Task4 {

	public static void main(String[] args) {

		int[] numbers = {-57, -41, -41, -24, -13, -5, 10, 54, 54, 58, 87, 91, 99, 114};
		
		System.out.println("Source array: " + Arrays.toString(numbers));
		
		boolean isSorted = false;
		
		while (!isSorted) {
			
			isSorted = true;
			
			for (int i = 1; i < numbers.length; i++) {
			
				if (numbers[i - 1] < numbers[i]) {
					int temp = numbers[i - 1];
					numbers[i - 1] = numbers[i];
					numbers[i] = temp;
					isSorted = false;
				}
			}
		}
		
		System.out.println("Sorted array with bubble sort: " + Arrays.toString(numbers));
	}

}
