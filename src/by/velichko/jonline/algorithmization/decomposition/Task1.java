package by.velichko.jonline.algorithmization.decomposition;

/*
Написать метод (методы) для нахождения наибольшего общего делителя и 
наименьшего общего кратного двух натуральных чисел:
|               A * B     |
| НОК(A,B) = ------------ |
|              НОД(A,B)   |
*/

public class Task1 {

	public static void main(String[] args) {

		int a = 45;
		int b = 40;
		
		System.out.println(gcd(a, b));
		
		System.out.println(lcm(a, b));
		
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
	
	
	public static int lcm (int a, int b) {
		
		return (a * b) / gcd(a, b);
	
	}

}
