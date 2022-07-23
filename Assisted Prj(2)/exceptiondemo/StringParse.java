package exceptiondemo;

public class StringParse {

	public static void main(String[] args) {
		String a = "KANISHKA";
		try {
		int b = Integer.parseInt(a);
		System.out.println("name is: " +a);
		}catch(NumberFormatException e) {
			System.out.println("Error Occured");
		}
		System.out.println("other logic continues below...");

	}

}
