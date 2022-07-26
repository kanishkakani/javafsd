package Array;

public class Matrix {
	public static void main(String[] args) {

		int r1 = 3, c1 = 2;

		int r2 = 2, c2 = 3;
		int[][] firstMatrix = { { 1, 7 }, { 5, -9},{38, 0 }};

		int[][] secondMatrix = { { 7, 8, 44}, { -9, 10, 25} };
		// method to multiply the matrix

		int[][] product = multiplyMatrix(firstMatrix, secondMatrix, r1, c1, c2);

		// display the result of multiplication

		displayProduct(product);

	}

	private static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2)

	{

		int[][] product = new int[r1][c2];// resultant matrix

		for (int i = 0; i < r1; i++) {

			for (int j = 0; j < c2; j++) {

				for (int k = 0; k < c1; k++) {

					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];

				}

			}

		}

		return product;

	}

	private static void displayProduct(int[][] product) {

		System.out.println("Product of two matrix is : ");

		for (int[] row : product) {

			for (int column : row) {

				System.out.print(column + " ");

			}

			System.out.println();

		}
	}

}
