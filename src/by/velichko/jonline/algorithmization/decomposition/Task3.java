package by.velichko.jonline.algorithmization.decomposition;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя
метод вычисления площади треугольника.
*/

public class Task3 {

	public static void main(String[] args) {

		double sideHex = 4;

		double areaHex = getHexagonArea(sideHex);

		System.out.println("Area of hexagon: " + areaHex);

	}
	

	public static double getTriangleArea(double a) {

		return (Math.sqrt(3) / 4) * Math.pow(a, 2);

	}
	
	
	public static double getHexagonArea (double a) {
		
		return 6 * getTriangleArea(a);
		
	}

}
