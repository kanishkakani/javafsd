package ArrayRotation;

public class ArrayRight {

	public static void main(String[] args) {
		int n = 5;
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Array before Right shift");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for(int i=0; i<n;i++) {
			int j, l;
			l=array[array.length-1];
			
			for(j=array.length-1; j>0; j--) {
				array[j]=array[j-1];
			}
			array[0]=l;
		}
		System.out.println();
		System.out.println("Array after Right shift");
		for (int i=0; i <array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}	
}

