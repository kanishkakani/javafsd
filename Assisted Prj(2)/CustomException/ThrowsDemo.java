package Assisted2;

public class ThrowsDemo {
	void Division() throws ArithmeticException {
		int a = 20, b = 0, rs;
		rs = a / b;

		System.out.print("The result is : " + rs);
	}

	public static void main(String[] args) {
		ThrowsDemo T = new ThrowsDemo();
		try {
			T.Division();
		} catch (ArithmeticException Ex) {
			System.out.print("Error : " + Ex.getMessage());
		}
		System.out.print("\nEnd of program.");
	}
}
