package MockInterQns;

public class LargetOfThreeNum {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
//		if(a>b && a>c) {
//			System.out.println("a is largest");
//		}
//		else if(b>c) {
//			System.out.println("b is largest");
//		}
//		else {
//			System.out.println("c is largest");
//		}
		
		
		//method 2 using ternary operator
		
		int largest1=a>b?a:b;
		System.out.println(largest1);
		
		int largest=largest1>c?largest1:c;
		System.out.println("largest is"+ largest);
		
		//in single line(replace with the above expression)
		
		int largest2=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(largest2);
		

	}

}
