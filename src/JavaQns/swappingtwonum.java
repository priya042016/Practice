package MockInterQns;

public class swappingtwonum {

	public static void main(String[] args) {
		// method 1.
		
		int a=10, b=20;
		
//		int t=0;
//		
//		t=a;
//		a=b;
//		b=t;
		
		//System.out.println(" swapped a value is:"+ a+" and b is:"+ b);
//		//method 2:
//		
//		a=a+b;//30
//		b=a-b;//10
//		a=a-b;//20
//		
//		System.out.println(" swapped a value is:"+ a+" and b is:"+ b);
		
//		//method 3:
		
//		a=a*b;//200
//		b=a/b;//10
//		a=a/b;//20
//		
//		System.out.println(" swapped a value is:"+ a+" and b is:"+ b);
		
		//method 4:
		
//		a=a^b;
//		b=b^a;
//		a=b^a;
//		System.out.println(" swapped a value is:"+ a+" and b is:"+ b);
		
		
		//method 5:
		
		b=a+b-(a=b);
		System.out.println(" swapped a value is:"+ a+" and b is:"+ b);
		
		
		

	}

}
