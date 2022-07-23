package Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// hashmap is the implementation of map.
		// it inherits hasmap class
		// it maintains insertion order
		// methods: put,get,remove,getKey
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Maxi");
		map.put(2, "Virat");
		map.put(3, "Rishi");
		map.put(4, null); // key is not null but value is null
		map.put(null, "Vicky"); // key is null but value is not null and not be added in map
		// you can add only one null key in map
		// map.put(null, null);//both key and value are null
		map.put(5, "Maxi");
		System.out.println(map);
		System.out.println("Get element at key 2: " + map.get(2));
		System.out.println("Get element at key 0: " + map.get(0));
		System.out.println("Get element at key 4: " + map.get(4));
		System.out.println("Get element at key null: " + map.get(null));
		// as key is null value Vicky is not added in map
		System.out.println("Get element at key 6: " + map.get(6));
		// as element is not present it will give you null answer
		// remove element by key
		map.remove(5);
		System.out.println(map);
		// iterate using for loop
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " , " + m.getValue());

		}

	}

}
