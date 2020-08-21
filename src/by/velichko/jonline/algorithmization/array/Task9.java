package by.velichko.jonline.algorithmization.array;

import java.util.Random;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто
встречающееся число. Если таких чисел несколько, то определить наименьшее
из них.
*/

public class Task9 {

	public static void main(String[] args) {

		int n = 20;
		int[] numbers = new int[n];

		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(20) - 10;
		}

		System.out.println("Source array:");
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();

		
		int oftenNumber = numbers[0];
		int counter = 1;

		for (int i = 0; i < numbers.length; i++) {

			int tempOftenNumber = numbers[i];
			int tempCounter = 0;

			for (int j = 0; j < numbers.length; j++) {
				if (tempOftenNumber == numbers[j]) {
					tempCounter++;
				}
			}

			if (tempCounter > counter) {
				oftenNumber = tempOftenNumber;
				counter = tempCounter;
			}

			if (tempCounter == counter) {
				oftenNumber = tempOftenNumber < oftenNumber ? tempOftenNumber : oftenNumber;
			}

		}

		System.out.println("The smallest often meeting number: " + oftenNumber);
		System.out.println("It meets " + counter + " times");
	}

}
