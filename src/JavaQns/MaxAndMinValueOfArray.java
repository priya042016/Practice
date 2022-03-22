package MockInterQns;

public class MaxAndMinValueOfArray {

	public static void main(String[] args) {
		int a[]= {10,20,40,80};
		int max=a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("maximum value of array is:"+ max);
		
		int min=a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("maximum value of array is:"+ min);

	}

}
