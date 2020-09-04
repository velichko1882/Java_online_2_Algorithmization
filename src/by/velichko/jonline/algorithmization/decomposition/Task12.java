package by.velichko.jonline.algorithmization.decomposition;

import java.util.Random;

/*
Даны натуральные числа K и N. Написать метод (методы) формирования массива A, элементами
которого являются числа, сумма цифр которых равна K и которые не больше N.
*/

public class Task12 {

	public static void main(String[] args) {

		int k = 45;
		int n = 2000000000;

		int[] numbers = toFormArray(k, n, 10);

		printArray("Formed array", numbers);

	}

	public static int getLength(int number) {

		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;
	}

	public static void invertArray(int[] array) {

		int n = array.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - 1 - i];
			array[n - 1 - i] = temp;
		}
	}

	public static int[] convertNumberToArray(int number) {

		int n = getLength(number);
		int[] array = new int[n];

		int i = 0;
		while (number > 0) {
			array[i] = number % 10;
			number /= 10;
			i++;
		}

		invertArray(array);

		return array;
	}

	public static int convertArrayToNumber(int[] array) {

		int number = 0;

		for (int i = 0; i < array.length; i++) {
			number += array[i] * Math.pow(10, array.length - 1 - i);
		}

		return number;
	}

	public static int getNumberWithMaxSumDigits(int border) {

		int[] borderArray = convertNumberToArray(border);
		int[] numberArray = new int[borderArray.length];
		if (border == (borderArray[0] + 1) * Math.pow(10, borderArray.length - 1) - 1) {
			numberArray[0] = borderArray[0];
		} else {
			numberArray[0] = borderArray[0] - 1;
		}

		for (int i = 1; i < numberArray.length; i++) {
			numberArray[i] = 9;
		}

		return convertArrayToNumber(numberArray);
	}

	public static int getNumber(int sumDigit, int border) {

		int numberWithMaxSumDigit = getNumberWithMaxSumDigits(border);

		int maxSum = getSumDigits(numberWithMaxSumDigit);

		if (maxSum == sumDigit) {
			return numberWithMaxSumDigit;
		}

		if (maxSum < sumDigit) {
			return 0;
		}

		Random rand = new Random();
		int[] digits = convertNumberToArray(numberWithMaxSumDigit);
		int diff = maxSum - sumDigit;

		while (diff > 0) {
			int index = rand.nextInt(digits.length);
			if (digits[index] != 0) {
				digits[index] -= 1;
				;
				diff--;
			}
		}

		return convertArrayToNumber(digits);
	}

	public static int getSumDigits(int number) {

		int sum = 0;
		int[] digits = convertNumberToArray(number);

		for (int e : digits) {
			sum += e;
		}

		return sum;
	}

	public static int[] toFormArray(int sumDigit, int border, int numberOfElemenys) {

		int[] numbers = new int[numberOfElemenys];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = getNumber(sumDigit, border);
		}

		return numbers;
	}

	public static void printArray(String message, int[] array) {
		System.out.println(message);
		for (int e : array) {
			System.out.print(e + "  ");
		}
		System.out.println();
	}
}
