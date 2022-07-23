package Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//tree set is one of the most imp implementation of sorted set interface in java
		// the order of the element is maintained by the set using their natural ordering
		// null is not allowed in treeset
		Set<String> s = new TreeSet<String>(); 
		s.add("Max");
		s.add("Vijay");
		s.add("Anith");
		s.add("Ben");
		//set.add(null);
		System.out.println(s);
		System.out.println("Size: "+s.size());
		System.out.println("Contains: "+ s.contains("Ben"));
	 

		

	}

}
