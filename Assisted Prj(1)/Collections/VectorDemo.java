package Collections;
import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> l= new Vector<String>();
		//differnece between array list and vector
		// 1. arraylist is not synchronized but vector is synchronised
		// 2. array list is not alegacy class. it was introduced in JDK12 but vector is legacy class
		// 3. arraylist is fast because it is not synchronized but vector is slow becuase it is synchronised
		System.out.println("Size:"+l.size());
		l.add("Max");
		l.add("Vijay");
		l.add("Vicky");
		l.add("Max");// duplicate value are allowed in list
		l.add(null);// list contains null value
		System.out.println("After Adding an Elements :"+l.size());
		System.out.println(l);
		System.out.println("Element at index 4: "+l.get(4));
		l.add("Ben");
		System.out.println(l);
		System.out.println("List Contains Vijay? :"+l.contains("Vijay"));
		l.remove(0);
		l.remove(null);
		System.out.println(l);
		//print a list using for loop
		for(String s:l) {
			System.out.println("Using For Loop: "+s);
		}
		//iterate using iterator
		Iterator<String> itr= l.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Iterator: "+itr.next());

		}

	

	}
}
