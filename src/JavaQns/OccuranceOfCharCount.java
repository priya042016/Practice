package MockInterQns;

public class OccuranceOfCharCount {

	public static void main(String[] args) {
		String s="Java Programming Java oops";
		
		System.out.println(s.length());
		
		//Method 1:
		int count =s.replaceAll("[^a]","").length();
		System.out.println(count);
		
		//Method 2:
		
		System.out.println(s.length()-s.replaceAll("a", "").length());

	}

}
