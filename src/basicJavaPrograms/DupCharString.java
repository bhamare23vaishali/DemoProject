package basicJavaPrograms;

public class DupCharString {

	public static void main(String[] args) {

		String str="beautiful beach";
		 char carry[]= str.toCharArray();  //convert string to character array
		 
		 System.out.println("The string is :"+str);
		 System.out.println("Duplicate character in above string are :");
		 
		 for(int i=0; i<str.length() ; i++)			// i loop to iterate through array
		 {
			 for(int j=i+1; j<str.length(); j++)	// j loop to compare with elements
				 
				 if (carry[i]==carry[j])
				 {
					 System.out.print(carry[j] + " ");
				 }
		 }
	
	
	
	
	}

}
