package javafsd;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		double result;
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		System.out.println("Enter second number");
		double num2 = scan.nextDouble();
		System.out.println("Enter the operator");
		System.out.println("Press 1 for ADD");
		System.out.println("Press 2 for SUBTRACT");
		System.out.println("Press 3 for MULTIPLY");
		System.out.println("Press 4 for DIVISION");
		char operator = scan.next().charAt(0);
		if(operator == '1') {
			result = num1+num2;
			System.out.println(result);
		}
		else if(operator == '2') {
			result = num1-num2;
			System.out.println(result);
		}
		else if (operator == '3') {
			result = num1*num2;
			System.out.println(result);
		}
		else if (operator == '4') {
			result = num1/num2;
			System.out.println(result);
		}
		else {
			System.out.println("Enter valid operator");
		}
		
	}

}
