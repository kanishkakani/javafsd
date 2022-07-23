package javafsd;

public class Typecasting {

	public static void main(String[] args) {
		//implicit Typecasting
		byte n = 10;
		int i = n;
		byte b = 15;
		double m = b;
		System.out.println("Converted to int: " +i);
		System.out.println("Converted to double: " +m);
		//explicit Typecasting
		double d = 12.5;
		int a = (int)d;
		// data loss when convert larger to smaller datatype(convert forcefully)
		System.out.println("Converted to int: " +a);
		float f = 1.5f;
		byte s = (byte)f;
		System.out.println("Converted to byte: " +s);
		

	}

}
