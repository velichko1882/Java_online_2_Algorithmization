package by.velichko.jonline.algorithmization.array;

/*
Дана последовательность целых чисел а1, а2,..., аn. Образовать новую
последовательность, выбросив из исходной те члены, которые равны
min(a1,a2,...,an).
*/

public class Task8 {

	public static void main(String[] args) {

		int[] numbers = {-36, -36, 25, -152, -3, 0, 59, 1, -152, 87, -5, 42, -15, 14, -9, -35};
		int[] newNumbers;
		
		int offset = 1;
		
		int min = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == min) {
				offset++;
			}
			if (numbers[i] < min) {
				min = numbers[i];
				offset = 1;
			}
		}
		
		
		System.out.println("Source array:");
		for (int i : numbers) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		System.out.println("Min element: " + min);
		System.out.println("Quantity of occurences: " + offset);
		
		
		newNumbers = new int[numbers.length - offset];
		
		for (int i = 0, j = 0; i < numbers.length; i++) {
			if (numbers[i] != min) {
				newNumbers[j] = numbers[i];
				j++;
			}
		}
		
		
		System.out.println("New array:");
		for (int i : newNumbers) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

}
