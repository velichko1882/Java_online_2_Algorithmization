package by.velichko.jonline.algorithmization.decomposition;

/*
Написать метод (методы) для вычисления суммы факториалов всех нечетных
чисел от 1 до 9.
*/

public class Task7 {

	public static void main(String[] args) {

		int from = 1;
		int to = 9;
		
		System.out.printf("Sum of factorials from %d to %d = %d", from, to, sumFactorials(from, to));
		
	}
	
	public static int factorial(int number) {
		
		int fact = 1;
		
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		
		return fact;
	}

	public static int sumFactorials(int from, int to) {
		
		int sum = 0;
		
		for (int i = from; i <= to; i = i + 2) {
			sum += factorial(i);
		}
		
		return sum;
	}
}
