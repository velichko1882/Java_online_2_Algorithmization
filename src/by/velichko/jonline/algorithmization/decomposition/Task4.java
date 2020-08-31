package by.velichko.jonline.algorithmization.decomposition;

/*
На плоскости заданы своими координатами n точек. Написать метод (методы),
определяющие, между какими из пар точек самое большое расстояние. Указание.
Координаты точек занести в массив.
*/

public class Task4 {

	public static void main(String[] args) {

		int n = 5;
		
		int[][] points = new int[n][];
		
		points[0] = new int[] { 0, 0};
		points[1] = new int[] { 0, 4};
		points[2] = new int[] { 0, -3};
		points[3] = new int[] { -8, 0};
		points[4] = new int[] { 7, 0};
		
		printPoints("Points:", points);
		
		printPoints("Two points with max distance:", getMaxDistancePoints(points));


	}
	

	public static double getDistance(int x1, int y1, int x2, int y2) {

		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow((y2 - y1), 2));

	}
	

	public static int[][] getMaxDistancePoints(int[][] points) {

		int indexMax1 = 0;
		int indexMax2 = 1;
		double maxDistance = 0;

		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = getDistance(points[i][0], points[i][1], 
						points[j][0], points[j][1]);
				if (distance > maxDistance) {
					maxDistance = distance;
					indexMax1 = i;
					indexMax2 = j;
				}
			}
		}

		return new int[][] { points[indexMax1], points[indexMax2] };
	}
	
	
	public static void printPoints(String message, int[][] points) {
		
		System.out.println(message);
		
		for (int i = 0; i < points.length; i++) {
			System.out.printf("point %d: [%d,%d]\n", i, points[i][0], points[i][1]);
		}
	}

}
