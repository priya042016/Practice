package MockInterQns;

import java.util.Arrays;

public class ChkEqualityOfTwoArrays {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4, 6};
		int a2[]= {1,2,3,4, 6};
		
		//Method 1: using Arrays class
		/*boolean status=Arrays.equals(a1, a2);
		if(status==true) {
			System.out.println("arrays are equal");
		}
		
		else {
			System.out.println("arrays are not equal");
		}*/
		
		//Method 2
		boolean status= true;
		
		if(a1.length==a2.length) {
			for(int i=0; i<a1.length; i++) {
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
			if(status!=false) {
				System.out.println("arrays are equal");
			}
			
		}
		
		else {
			status=false;
			System.out.println("Arrays are not equal");
		}

	}

}
