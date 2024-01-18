package basicJavaPrograms;

public class DupArrayElements {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,2,7,8,8,3};
		
		System.out.println("Duplicate elements in array is: ");
		
		//searches for duplicate elements
		for(int i=0; i<a.length; i++) //to iterate through array
		{
			for( int j=i+1 ; j<a.length; j++)	//to compare with next element in array
				if(a[ i ]==a[ j ])
					System.out.println(a[j]);
		}

	}

}
