package MockInterQns;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		String a[]= {"java", "python", "c++", "java"};
		
		//method 1
		
		//boolean flag=false;
		/*for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate item found");
					flag=true;
				}
				
			}
					}
		if(flag!=true) {
			System.out.println("no duplicates");
		}*/
		
		
		//Method 2: using HashSet. this will not allow to add duplicates
		
		HashSet<String> lang=new HashSet();
		boolean flag=false;
		for(String e:a) {
			
			if(lang.add(e)==false) {
				System.out.println("duplicate item found: "+e);
				flag=true;
					}
			}
					
		if (flag==false){
				System.out.println("no duplicates");
		}
		
		
			}
			
		}




