package MockInterQns;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method 1:
		
		String str="ABCD";
		String rev="";
		int len=str.length();
		
//		for(int i=len-1; i>=0; i--) {
//			rev=rev+str.charAt(i);
//		}
//		
//		System.out.println(rev);
		
		//method 2: using character Array
		
//		char ch[]=str.toCharArray();
//		
//		for(int i=len-1; i>=0; i--) {
//			rev=rev+ch[i];
//		}
//		System.out.println(rev);
		
		//method 3 using String Buffer:
		
//		StringBuffer sb=new StringBuffer(str);
//		System.out.println(sb.reverse());
		
		//method4:
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(str);
		System.out.println(sb1.reverse());
		
		
		
		
		

	}
	
	

}
