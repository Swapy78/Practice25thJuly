//Java program to convert array to arraylist

package demo;

import java.util.*;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String[] array = {"Blue","Black","Red","Green","Grey"};
		
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
		
		System.out.println("Arraylist elements are "  +arrayList);

	}

}
