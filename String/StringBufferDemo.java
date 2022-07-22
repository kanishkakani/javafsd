package String;

  public class StringBufferDemo{
	public static void main(String[] args) {
		String str = new String("Hello World");
		// convert string to string buffer
		StringBuffer s = new StringBuffer(str);
		 
		System.out.println("Length: " + s.length());
		s.append("welcome");
		System.out.println(s);
		s.insert(11, " ");
		System.out.println(s);
		s.replace(12, 19, "Bye");
		System.out.println(s);
		s.reverse();
		System.out.println(s);

	}

}
