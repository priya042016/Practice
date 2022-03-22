package MockInterQns;

public class PrintEvenAndOddNumFromArray {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6};
		
		System.out.println("even numbers");
		
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
		
		System.out.println("odd numbers");
			for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				
				System.out.println(a[i]);
			}
		}
			
			//using advanced for loop for even num
			System.out.println("even num using advanced for loop");
			for(int value: a) {
				if(value%2==0) {
					System.out.println(value);
				}
			}
		
		
		
	}
}




