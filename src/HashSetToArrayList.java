//Java program to convert hashset to arraylist

package demo;

import java.util.*;

public class HashSetToArrayList {

	public static void main(String[] args) {
	
		HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Grey");
        
        System.out.println(hashSet);

      
        List<String> arrayList = new ArrayList<>(hashSet);

        
        System.out.println("\nArrayList elements are " + arrayList);
    }
}


