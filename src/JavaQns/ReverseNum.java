package MockInterQns;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to reverse:");
		int num=sc.nextInt();
//		
//		int rev=0;
//		
//		//method 1 using algorithm
//		
//		while(num!=0) {
//		rev=rev*10+(num%10);//take the remainder and add with rev*10
//			num=num/10;//take the quotient
//		}
//		
//		System.out.println(rev);
		
		//method 2 using string buffer:
		
//		StringBuffer rev;
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		rev=sb.reverse();
//		System.out.println(rev);
		
		//method 3 using String Builder:
		
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		
		sbl.append(num);
		rev= sbl.reverse();
		
		System.out.println(rev);
		
		
		

	}

}
