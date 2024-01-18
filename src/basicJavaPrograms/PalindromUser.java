package basicJavaPrograms;

import java.util.Scanner;

public class PalindromUser {

	public static void main(String[] args) {

		int temp,n,sum=0,r;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no: ");
		n=s.nextInt();
		
		temp=n;			//hold no in temp variable
		while(n>0)		//Reverseing given no
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum) //bcz reverse no is stored in sum
			System.out.println("Given no is palindrome no");
		
		else
			System.out.println("Given no is not a palindrome no");
	}

}
