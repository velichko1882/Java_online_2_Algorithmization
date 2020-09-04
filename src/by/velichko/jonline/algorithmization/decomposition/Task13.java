package by.velichko.jonline.algorithmization.decomposition;

/*
Два простых числа называются "близнецами", если они отличаются друг от друга
на 2 (например, 41 и 43). Найти и напечатать все пары "близнецов" из отрезка
[n, 2n], где n - заданное натуральное число больше 2. Для решения задачи
использовать декомпозицию.
*/

public class Task13 {

	public static void main(String[] args) {

		int n = 100;
		
		findTwins(n, 2 * n);
		
	}

	public static boolean isSimple(int number) {
		
		boolean isSimple = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isSimple = false;
				break;
			}
		}
		return isSimple;
	}
	
	public static void findTwins(int from, int to) {
		
		int count = 0;
		
		for (int i = from; i <= to; i++) {
		
			if (isSimple(i) && i + 2 <= to && isSimple(i + 2)) {
				count++;
				System.out.println("Twins" + count + ": " + i + "   " + (i + 2));
			}
		}
		
		if (count == 0) {
			System.out.println("The segment [" + from + ", " + to + "] have no twins");
		}
	}
}
