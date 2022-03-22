package MockInterQns;

public class RegularExpressionToRemoveWhiteSpace {

	public static void main(String[] args) {
		String str= "Java    selenkum   pgm  automation";
		
//		str=str.replaceAll("\s", "");//s for space
//		System.out.println(str);
		str=str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
