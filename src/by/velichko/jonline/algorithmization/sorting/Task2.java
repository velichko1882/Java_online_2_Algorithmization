package by.velichko.jonline.algorithmization.sorting;

import java.util.Arrays;

/*
Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
Образовать из них новую последовательность чисел так, чтобы она тоже была
неубывающей. Примечание. Дополнительный массив не использовать.
*/

public class Task2 {

	public static void main(String[] args) {

		int[] arrayA = { -56, -32, -31, -29, -28, -27, -26, -24, -22, -18 };
		int[] arrayB = { -140, -120, -115, -114, -112, -110, -100, -99, 100, 110, 120 };

		int[] arrayC = new int[arrayA.length + arrayB.length];

		int indexA = 0;
		int indexB = 0;
		int indexC = 0;

		while (indexC < arrayC.length) {
			
			if (indexA >= arrayA.length || indexB >= arrayB.length) {
				
				if (indexA >= arrayA.length) {
					arrayC[indexC] = arrayB[indexB];
					indexB++;
				} else {
					if (indexB >= arrayB.length) {
						arrayC[indexC] = arrayA[indexA];
						indexA++;
					}
				}
				
			} else {
				
				if (arrayA[indexA] <= arrayB[indexB]) {
					arrayC[indexC] = arrayA[indexA];
					indexA++;
				} else {
					arrayC[indexC] = arrayB[indexB];
					indexB++;
				}
			}
			
			indexC++;
		}

		System.out.println("Array A: " + Arrays.toString(arrayA));
		System.out.println("Array B: " + Arrays.toString(arrayB));
		System.out.println("Array C: " + Arrays.toString(arrayC));

	}

}
