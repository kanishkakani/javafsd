package Array;

public class Array1 {

	public static void main(String[] args) {
		int array[] = { 5, 26, 45, 29, 22, 96 };
		System.out.println("Element at index 2: " + array[2]);
		System.out.println("Array Length: " + array.length);
		System.out.println("Using for loop");
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}
		System.out.println();
		for (int m : array) {
			System.out.print(m + " ");
		}

	}
	

}
