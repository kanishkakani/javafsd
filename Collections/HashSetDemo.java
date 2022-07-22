package Collections;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
//hashset class implemensts set interface
//methods add, remove,contains and size;
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(35);
		s.add(12);
		s.add(23);
		s.add(10);
		s.add(34);
		s.add(34);
		s.add(null);
		System.out.println("Size: " + s.size());
		System.out.println(s);
		System.out.println("Contains: " + s.contains(1));
		s.remove(null);
		System.out.println(s);

	}
}
