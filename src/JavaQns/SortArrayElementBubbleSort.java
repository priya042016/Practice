package MockInterQns;

import java.util.Arrays;

public class SortArrayElementBubbleSort {

	public static void main(String[] args) {
		//bubble sort
		
		int a[]= {4,3,2,3,1};
		
		int n=a.length;
		
		System.out.println("Arrays element before sorting: "+ Arrays.toString(a));
		
		for(int i=0; i<n-1; i++)//n-1 passes
		{
			for(int j=0; j<n-1; j++) //n-1 iterations inside each pass
			{
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
			}
		}
		
		System.out.println("Arrays element before sorting: "+ Arrays.toString(a));

	}

}
