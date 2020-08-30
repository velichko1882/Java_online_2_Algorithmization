package by.velichko.jonline.algorithmization.decomposition;

/*
Написать метод (методы) для нахождения наибольшего общего делителя
четырех натуральных чисел.
*/

public class Task2 {

	public static void main(String[] args) {

		int a = 31;
		int b = 67;
		int c = 99;
		int d = 123;
		
		System.out.println(gcdFourNumber(a, b, c, d));
		
	}
	
	
	public static int gcdFourNumber (int a, int b, int c, int d) {
		
		return gcd(d, gcd(c, gcd(a, b)));
	
	}
	
	
	public static int gcd(int a, int b) {
		
		while (a != 0 && b != 0) {
		
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		
		return a + b;
	}


}
