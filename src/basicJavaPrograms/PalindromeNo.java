package basicJavaPrograms;

public class PalindromeNo {

	public static void main(String[] args) {

		int r,sum=0,temp;	//r is remainder
		int n=454;
		
		temp=n; 	//hold the no in temp veriable
		
		while(n>0)	//reverse the no
		{
			r=n%10;						//454/10= 4 i.e r=4				2)45%10=5
			sum= (sum*10)+r;	//sum=(0*10)+4=4					(4*10)+5=45
			n=n/10;						//454/10=45								4/10=4
			
		}
	
		if(temp==sum)
			System.out.println("454 is palindrome no");
		
		else
			System.out.println("454 is not a prime no");
	
	
	
	
	}

}
