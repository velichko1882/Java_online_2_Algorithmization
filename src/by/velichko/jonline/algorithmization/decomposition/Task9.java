package by.velichko.jonline.algorithmization.decomposition;

/*
Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод (методы)
вычисления его площади, если угол между сторонами длиной X и Y - прямой.
*/

public class Task9 {

	public static void main(String[] args) {

		double x = 4.2;
		double y = 5.7;
		double z = 10.9;
		double t = 10.8;

		boolean isConvex = false;

		double area = calcAreaTetragon(x, y, z, t, isConvex);

		if (area == 0) {
			System.out.println("The tetragon with these parameters is not exist");
		} else {
			System.out.printf("The area of the tetragon: %f\n", area);
		}
	}

	public static double calcDiagonal(double sideA, double sideB) {

		return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
	}

	public static double calcAreaRightTriangle(double sideA, double sideB) {

		return (sideA * sideB) / 2;
	}

	public static double calcAreaTriangle(double sideA, double sideB, double sideC) {

		double semiPerimeter = (sideA + sideB + sideC) / 2;

		return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * 
				(semiPerimeter - sideC));
	}

	public static double calcAreaTetragon(double sideA, double sideB, double sideC, 
			double sideD, boolean isConvex) {

		double diagonal = calcDiagonal(sideA, sideB);

		if (diagonal > (sideC + sideD)) {
			return 0;
		}

		if (!isConvex && (sideA + sideB < sideC + sideD)) {
			return 0;
		}

		double area1 = calcAreaRightTriangle(sideA, sideB);
		double area2 = calcAreaTriangle(diagonal, sideC, sideD);

		if (isConvex) {
			return area1 + area2;
		} else {
			return area1 - area2;
		}
	}

}
