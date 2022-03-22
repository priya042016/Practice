package MockInterQns;

public class SearchingAnElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,40,50};//linear search
		
		int search_ele=30;
		
		boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			if (a[i]==search_ele) {
				System.out.println("element found "+ a[i]);
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("element not found");
		}

	}

}
