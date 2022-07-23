package Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		// not allows null key in the table
		// null values are not allowed in hastable
		// insertion order in not maintain
		map.put(1, "Mega");
		map.put(2, "Mahi");
		map.put(3, "Jack");
		map.put(5, "Maxi");
		//map.put(8, null);
		//null values are not allowed in hastable
		System.out.println(map);
		System.out.println("Get element at key 2: " + map.get(2));
		System.out.println("Get element at key 5: " + map.get(5));
		System.out.println("Get element at key 7: " + map.get(7));
		System.out.println("Get element at key 10: " + map.get(10));
		// as element is not present it will give you null															
		map.remove(5);
		System.out.println(map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " , " + m.getValue());

		}
	}

}
