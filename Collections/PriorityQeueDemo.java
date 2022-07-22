package Collections;

import java.util.PriorityQueue;

public class PriorityQeueDemo {
	public static void main(String[] args) {
		// priority queue doesn't allow null values
		// we can't create priority queue that are non comparable
		// que retirval operations are poll, remove,peek
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
		Q.add(25);
		Q.add(35);
		Q.add(45);
		Q.add(55);
		System.out.println(Q);
		System.out.println("Top Element: " + Q.peek());
		System.out.println(" Printing Top element & removing it: " + Q.poll());
		System.out.println(Q);
		System.out.println("Top Element: " + Q.peek());
		Q.remove(35);
		System.out.println("After Remove : " +Q);
	}

}
