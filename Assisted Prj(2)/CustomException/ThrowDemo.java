package Assisted2;

public class ThrowDemo {
	public static void main(String[] args) {

		int a = 20, b = 0, rs;
		try {
			if (b == 0)
				throw (new ArithmeticException("Can't divide by zero"));
			else {
				rs = a / b;
				System.out.print("The result is : " + rs);
			}
		} catch (ArithmeticException Ex) {
			System.out.print("Error : " + Ex.getMessage());
		}

		System.out.print("\nEnd of program");
	}
}
