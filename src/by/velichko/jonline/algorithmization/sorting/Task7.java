package by.velichko.jonline.algorithmization.sorting;

import java.util.Arrays;

/*
Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... an
и b1 <= b2 <= ... <= bm. Требуется указать те места, на которые нужно вставлять элементы
последовательности b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая
последовательность оставалась возрастающей.
*/

public class Task7 {

	public static void main(String[] args) {

		double[] arrayA = { -25.8, -19.4, -9.3, -1.2, 2.8, 14.4, 21.9, 46.7, 54.1, 87.1 };

		double[] arrayB = { -19.4, -31, 5, -14.2, -1.3, 0, 2.8, 9.8, 25.4, 31.8, 99.7, 99.8 };

		int indexToInsert;

		System.out.println("Array A: " + Arrays.toString(arrayA));

		System.out.println("Array B: " + Arrays.toString(arrayB));

		for (int i = 0; i < arrayB.length; i++) {
			
			int low = 0;
			int high = arrayA.length - 1;
			int mid = 0;
			
			while (low <= high) {
				mid = (low + high) / 2;
				if (arrayA[mid] == arrayB[i]) {
					indexToInsert = mid;
					break;
				}
				if (arrayA[mid] > arrayB[i]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			
			if (arrayB[i] > arrayA[mid]) {
				indexToInsert = mid + 1;
			} else {
				indexToInsert = mid;
			}
			
			System.out.println("The element of array B[" + i + "] = " + arrayB[i] 
					+ " insert in array A in position "	+ indexToInsert);
		}

	}

}
