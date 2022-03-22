package MockInterQns;

import java.util.Scanner;

public class PolintromeStringOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("PLease enter string:");
		String str=sc.next();
		
		String org_str=str;
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(org_str.equalsIgnoreCase(rev)) {
			System.out.println("given string is polindrome");
		}
		else {
			System.out.println("given string is not polindrome");
		}
		
		
	

	}

}
