package InnerClass;

public class LocalInner {
	void Check(String locker_key) {

		if (locker_key.equals("kani233@gmail.com")) {

			class Inner {
				void validate() {

					System.out.println("User Found and Authenticated");
				}
			}
			Inner inner = new Inner();
			inner.validate();

		}
		else {
			System.out.println("Not Valid");
		}
	}

	public static void main(String[] args) {
		LocalInner outer = new LocalInner();

		outer.Check("kani233@gmail.com");
	}

}
