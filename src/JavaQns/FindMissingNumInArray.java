package MockInterQns;

public class FindMissingNumInArray {

	public static void main(String[] args) {
		//should be in range
		//can be in any order
		//should not have any duplicates
		
		int a[]= {1,2,4,5};
		int sum1=0, sum2=0;
		
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		
		//use index for i
		for(int i=1; i<=5;i++) {
			sum2=sum2+i;
		}
		
System.out.println("missing number in the given array is"+ (sum2-sum1));
	}

}
