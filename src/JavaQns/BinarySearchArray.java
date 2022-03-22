package MockInterQns;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};//array should be in sorted order
		
		//method 1: using binary search algorithm
		
		int l=0;
		int h=a.length-1;
		int key=5;
		
		boolean flag=false;
		while(l<=h) {
			int m=(l+h)/2;
			if(a[m]==key) {
				System.out.println("element found");
				flag=true;
				break;
					}
			
			if(a[m]<key) {
				l=m+1;
				
			}
			
			if(a[m]>key) {
				h=m-1;
			}
		}
			
		
		if(flag==false) {
		
		System.out.println("element not found");
		}
	
		//method 2 using Arrays
		
		System.out.println(Arrays.binarySearch(a, 8));//8 not found, so returns negative value
		System.out.println(Arrays.binarySearch(a, 3));//giving index of 3. (ie) 2
		
		
		

	}

}
