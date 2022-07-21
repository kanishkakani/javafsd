package javafsd;

public class AccessModifier {
	public void methodPublic() {
		System.out.println("Inside the Public method");
		
	}
	public void methodPrivate() {
		System.out.println("Inside the Private method");
	}
	public void methodDefault() {
		System.out.println("Inside the Default method");
	}
	public void methodProtected() {
		System.out.println("Inside the Protected method");
	}
	//same class can access all type of modifiers
	public static void main(String[] args) {
		AccessModifier A = new AccessModifier();
		A.methodPublic();
		A.methodPrivate();
		A.methodDefault();
		A.methodProtected();
	}

}
