package Assisted2;

public class FinallyBlockDemo {
	public static void main(String[] args) {
		int a = 20, b = 0, rs = 0;
		try {
			rs = a / b;
		} catch (ArithmeticException Ex) {
			System.out.print("Error : " + Ex.getMessage());
		} finally {
			System.out.print("\nThe result is : " + rs);
		}
	}
}
