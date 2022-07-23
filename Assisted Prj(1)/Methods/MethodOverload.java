package javafsd;

public class MethodOverload {
	
	int add(int m,int n) {
		return m+n;
	}
	float add(float m,float n,float p) {
		return m+n+p;
	}
	double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {

		MethodOverload obj= new MethodOverload();

		System.out.println("Addition of 30 and 26 :"+obj.add(30, 26));

		System.out.println("Addition of 25.4and 1.68 :"+obj.add(25.4f,1.68f));

		System.out.println("Addition of 24.36 and 45.67 double :"+obj.add(24.36, 45.67));

		
	}
}
