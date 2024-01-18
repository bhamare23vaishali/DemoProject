package basicJavaPrograms;

public class SmallLargestArray {

	public static void main(String[] args) {

		int a[] = {12,13,1,10,34,10};
		
		int smallest=a[0] , largest=a[0];
		
		for(int i=0; i<a.length ;i++)
		{
			if(smallest > a[i])
				smallest =a[i];
			
			if(largest < a[i])
				largest =a[i];
		}
		System.out.println("Smallest element in array is : "+smallest);
		System.out.println("Largest element in array is :"+largest);

	}

}
