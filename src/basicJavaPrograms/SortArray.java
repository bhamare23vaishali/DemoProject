package basicJavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {

		int a[]= {55,44,22,99,77,66};
		
		System.out.println("Defauly array is :"+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("Array elements in Ascending order : ");
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		
		
	}

}
