package basicJavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
	 
		int n1=0,n2=1,n3,count =10;
		
		System.out.print(n1+" "+n2);
		for(int i =2; i<count; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2; //to shift right side and take next element 
							//n2 becomes n1 
			n2=n3;	//n3 becomes n2
			
			// 0	   1		1
			//n1    n2    n3
			//        n1    n2
			//          1+1=2
			//0      1       1    2 
		}
		
	}

}
