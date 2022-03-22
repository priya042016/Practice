package MockInterQns;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		//checkPrime(20) ;
		
		//prime: if num is divided by 1 and itself is prime.so, should have only 2 division factors. else not prime
		//prime number should be >1
		
		int num=14;
		int div_count=0;
		
		if(num>1) {
			
			for(int i=1; i<=num; i++) {
				if(num%i==0) 
					div_count++;
						}
			if(div_count==2) {
				System.out.println(num+" "+"is prime");
			}
			else 
				System.out.println(num+" "+"is not a prime number");
			
		}
		
		else {
			System.out.println(num+" "+"is not a prime number");
		}

	}
	
//	public static void checkPrime(int num) {
//		for (int i = 2; i < num; i++) {
//			if(num%i==0)
//			{
//				System.out.println("not a prime no "+num);
//				//return true;
//			}
//		}
//		System.out.println("is a prime no "+num);
//		//return false;
//	}

	}



