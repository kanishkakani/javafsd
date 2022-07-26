package Array;

import java.util.Scanner;

public class LIncreasingSeq {
	public int[] lis(int[] N) {
		int n = N.length - 1;
		int[] A = new int[n + 1];
		int[] B = new int[n + 1];
		int L = 0;

		for (int i = 1; i < n + 1; i++) {
			int j = 0;
			for (int pos = L; pos >= 1; pos--) {
				if (N[A[pos]] < N[i]) {
					j = pos;
					break;
				}
			}
			B[i] = A[j];
			if (j == L || N[i] < N[j + 1]) {
				A[j + 1] = i;
				L = Math.max(L, j + 1);
			}
		}

		/* backtrack */

		int[] result = new int[L];
		int pos = A[L];
		for (int i = L - 1; i >= 0; i--) {
			result[i] = N[pos];
			pos = B[pos];
		}
		return result;
	}

	/* Main Function */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no.of elements");
			int n = sc.nextInt();
			int[] arr = new int[n + 1];
			System.out.println("\nEnter " + n + " elements");
			for (int i = 1; i <= n; i++)
				arr[i] = sc.nextInt();

			LIncreasingSeq obj = new LIncreasingSeq();
			int[] result = obj.lis(arr);

			/* print result */

			System.out.print("\nLongest Increasing Subsequence is : ");
			for (int i = 0; i < result.length; i++)
				System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}