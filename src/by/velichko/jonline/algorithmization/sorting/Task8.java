package by.velichko.jonline.algorithmization.sorting;

import java.util.Random;

/*
            p1    p2         pn
Даны дроби ----, ----, ..., ---- (pi, qi - натуральные). Составить программу, которая
            q1    q2         qn
            
приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
*/

public class Task8 {

	public static void main(String[] args) {

		int n = 5;
		int[] numerators = new int[n];
		int[] denominators = new int[n];

		Random rand = new Random();

		for (int i = 0; i < numerators.length; i++) {
			numerators[i] = rand.nextInt(10) + 1;
		}

		for (int i = 0; i < denominators.length; i++) {
			denominators[i] = rand.nextInt(10) + 2;
		}

		int maxDenominator = denominators[0];

		for (int i = 1; i < denominators.length; i++) {
			if (denominators[i] > maxDenominator) {
				maxDenominator = denominators[i];
			}
		}

		int leastCommonMultiple = maxDenominator;

		int factor = 1;

		boolean isLCMFind = false;

		while (!isLCMFind) {
			leastCommonMultiple = maxDenominator * factor;
			int count = 0;
			for (int i = 0; i < denominators.length; i++) {
				if (leastCommonMultiple % denominators[i] == 0) {
					count++;
				} else {
					break;
				}
			}
			if (count == denominators.length) {
				isLCMFind = true;
			} else {
				factor++;
			}
		}

		System.out.println("Fractions:");
		for (int i = 0; i < n; i++) {
			System.out.print(numerators[i] + "/" + denominators[i] + "   ");
		}
		System.out.println();
		System.out.println("Common denominator: " + leastCommonMultiple);

		int[] multipliers = new int[n];

		for (int i = 0; i < n; i++) {
			int multiplier = leastCommonMultiple / denominators[i];
			multipliers[i] = multiplier;
			numerators[i] *= multiplier;
			denominators[i] = leastCommonMultiple;
		}
		
		System.out.println("Fractions with common denominator:");
		for (int i = 0; i < n; i++) {
			System.out.print(numerators[i] + "/" + denominators[i] + "   ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			
			int min = numerators[i];
			int indexMin = i;
			
			for (int j = i + 1; j < n; j++) {
				if (numerators[j] < min) {
					min = numerators[j];
					indexMin = j;
				}
			}
			if (indexMin != i) {
				int temp = numerators[i];
				numerators[i] = numerators[indexMin];
				numerators[indexMin] = temp;
				temp = multipliers[i];
				multipliers[i] = multipliers[indexMin];
				multipliers[indexMin] = temp;
			}
		}
		
		System.out.println("Fractions in order ascending with common denominator:");
		for (int i = 0; i < n; i++) {
			System.out.print(numerators[i] + "/" + denominators[i] + "   ");
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			numerators[i] /= multipliers[i];
			denominators[i] /= multipliers[i];
		}

		System.out.println("Fractions in order ascending:");
		for (int i = 0; i < n; i++) {
			System.out.print(numerators[i] + "/" + denominators[i] + "   ");
		}
		System.out.println();

	}

}
