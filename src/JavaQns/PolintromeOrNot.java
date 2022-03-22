package MockInterQns;

import java.util.Scanner;

public class PolintromeOrNot {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter no.");
		
		int num=sc.nextInt();
		int rev=0;
		int org_num=num;
		
		//reversing
		while(num>0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		System.out.println(rev);
		if(org_num==rev) {
			System.out.println("given num is pointrome");
			}
		else {
			System.out.println("given no. is not polintrome");
		}

	}

}
