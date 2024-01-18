package basicJavaPrograms;

public class FactorialNo {

	public static void main(String[] args) {
		 
		int fact =1;
		int no=5; // It is the no to calculate the factorial
		
		for(int i=1; i<=no; i++)
		{
			fact= fact*i;
		}
		System.out.println("Factorial of 5 is :"+fact);
	}

}
