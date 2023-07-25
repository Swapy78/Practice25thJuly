//Java program to convert linkedlist into arraylist

package demo;

import java.util.*;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		
		System.out.println("Linked list " +linkedList);
		
		ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
		
		System.out.println("\nArraylist elements are "+arrayList);
		
		

	}

}
