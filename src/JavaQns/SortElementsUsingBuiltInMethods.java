package MockInterQns;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsUsingBuiltInMethods {

	public static void main(String[] args) {
		int a[]= {60, 30, 10, 20};
		
		System.out.println("before sorting: "+ Arrays.toString(a));
		
		//Method 1:
		
//		Arrays.parallelSort(a);
//		System.out.println("after sorting: "+ Arrays.toString(a));
		
		//Method 2: sort
		
		Arrays.sort(a);
		System.out.println("after sorting: "+ Arrays.toString(a));
		
		//Method 3:in descending
		
		Integer b[]= {40, 34, 23, 66};//The Integer class wraps a value of the primitive type int in an object.
											//An object of type Integer contains a single field whose type is int
		Arrays.sort(b);
		System.out.println("after sorting in ascending order: "+ Arrays.toString(b));
				
		Arrays.sort(b, Collections.reverseOrder());//supports objects(non-primitive data types) . so change int to Integer
		
		System.out.println("after sorting in descending order: "+ Arrays.toString(b));

	}

}
