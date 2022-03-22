package MockInterQns;

public class ArmstrongNumOrNot {

	public static void main(String[] args) {
		//In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:
		//153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
		
		int num=153;
		int result=0;
		int org_num=num;
		
		
		while(num!=0) {
			int rem=num%10;
			result=(int) (result+ Math.pow(rem, 3));
			num=num/10;
				
		}
		
		System.out.println(result);
		if(result==org_num) {
			System.out.println(org_num+" "+"is armstrong number");
		}
		else {
			System.out.println(org_num+" "+"is not armstrong number");
		}
	}

}
