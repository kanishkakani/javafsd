package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("D");
// note: do not allows duplicate values
		
		ls.add("A");
		ls.add("E");
		ls.add(null);
		System.out.println("Size: " + ls.size());
		System.out.println(ls);
		System.out.println("Contains E: " + ls.contains("E"));
		ls.remove(null);
		System.out.println("After Remove: " + ls);
	}

}
