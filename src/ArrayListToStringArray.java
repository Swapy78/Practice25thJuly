//Java program to convert arraylist to stringarray

package demo;

import java.util.*;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		
		ArrayList<String> List = new ArrayList<>();
		List.add("Blue");
		List.add("Black");
		List.add("Red");
		List.add("Green");
		List.add("Grey");
		
		System.out.println(List);
		
		String[] stringArray = List.toArray(new String[List.size()]);

		System.out.println("String array elements are ");
		
		for (int i = 0; i < stringArray.length; i++) {
            String string = stringArray[i];
            System.out.println(string);
		
	}

	}
}

