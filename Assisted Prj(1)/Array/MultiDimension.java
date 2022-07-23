package Array;

public class MultiDimension {

	public static void main(String[] args) {
		int array[][] = { { 2, 1, 6 }, { 1, 0, 2 }, { 7, 3, 12 } };
		System.out.println("First row 1st  element: " + array[0][0]);
		System.out.println("Second row 2nd element: " + array[1][1]);
		System.out.println("Third row 3rd element: " + array[2][2]);
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
