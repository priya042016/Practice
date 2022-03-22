package MockInterQns;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java, Selenium, TestNg, Maven";
		
		String str[]=s1.split(",");
		for(String e:str) {
			System.out.println(e);
		}
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}

	}

}
