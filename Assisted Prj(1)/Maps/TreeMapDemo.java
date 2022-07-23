package Maps;

import java.util.Map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		// null key is not accepted in tree map but null value can be accepted

		// treemap is implementation of map and sorted map

		// it maintains insertion order
		map.put(1, "Mega");
		map.put(2, "Virat");
		map.put(3, "Jack");
		map.put(4, null);
		map.put(5, "Maxi");
		System.out.println(map);
		System.out.println("Get element at key 3: " + map.get(3));
		System.out.println("Get element at key 1: " + map.get(1));
		System.out.println("Get element at key 6: " + map.get(6));
		System.out.println("Get element at key 2: " + map.get(2));
		map.remove(2);
		System.out.println(map);
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " , " + m.getValue());

		}
	}

}
