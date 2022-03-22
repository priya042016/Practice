package MockInterQns;

public class RegularExpressionToRemoveJunkChar {

	public static void main(String[] args) {
		String s="$@##%$#%$#%&*&^*^& $Selenium03754";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
	

}
