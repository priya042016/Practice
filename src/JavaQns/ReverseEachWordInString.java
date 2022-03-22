package MockInterQns;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		//Method 1
		
		String str="Welcome to Java";
		
		String str1[]=str.split(" ");
		System.out.println(str1.length);
		
		System.out.println(Arrays.toString(str1));
		
		
		String revString="";
		
		for (String words:str1) {
			String revWord="";//important to use inside loop
			for(int i=words.length()-1; i>=0; i--) {
				revWord= revWord + words.charAt(i);
			}
			revString=revString+revWord+" ";
			
				}
		
		System.out.println(revString);
		
		//method 2 using string buffer
		
		String str2="Welcome to Java";
		String s[]=str2.split(" ");
			
		String revString1="";
		for(String word:s) {
			String revWord1="";
			StringBuffer sb=new StringBuffer(word);
			revWord1=revWord1+sb.reverse();
			revString1=revString1+revWord1+" ";
		}
		System.out.println(revString1);
		
		
		
		

	}

}
