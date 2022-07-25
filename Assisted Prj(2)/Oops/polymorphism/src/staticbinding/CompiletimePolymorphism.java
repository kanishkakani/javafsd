package staticbinding;
import java.io.FileReader;
public class CompiletimePolymorphism {
	 public static void main(String[] args) {
		 CompiletimePolymorphism obj = new CompiletimePolymorphism();
		 obj.add(10,26);
		 obj.add(23.26, 21.55);
		 
	 }
	 void add(int a,int b) {
		int  result = a+b;
		System.out.println("Result: " +result);
	 }
	 void add(double a,double b) {
		 double result = a+b;
		 System.out.println("Result: "+result);
	 }

}
