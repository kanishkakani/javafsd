package InnerClass;

public class LocalInnerMethod {
	public void dispaly() {

		class Inner {

			int a = 26;

			void print() {
				System.out.println("Inside Inner Class Method");
				System.out.println("Value of a : " + a);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}

	public static void main(String[] args) {
		LocalInnerMethod outer = new LocalInnerMethod();
		outer.dispaly();
	}

}
