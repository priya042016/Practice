package MockInterQns;

public class CountOfUpperAndLower {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		String s="Welcome to Automation";
		
		int lcount=0;
		int ucount=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				ucount=ucount+1;
			}
			
			else {
				lcount=lcount+1;
				}
		}
		
		System.out.println("upper count is"+ucount);
		System.out.println("lower count is"+lcount);
			
		

	}

}
