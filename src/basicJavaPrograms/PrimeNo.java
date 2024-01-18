package basicJavaPrograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {

		int n,count=0,i;
		
		System.out.println("enter any no : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(i=2; i<n ;i++)		//0 and 1 cant be count so start from 2
		{
			if(n%2 ==0)			//check if no is even ..if it is even increase count by 1
			{
				count++;
				break;
			}
		}
		if(count==0)		//if count is not incresed by 1 i.e prime no
			System.out.println("It is a prime no");
		else
			System.out.println("It is not a prime no");
		

	}

}
