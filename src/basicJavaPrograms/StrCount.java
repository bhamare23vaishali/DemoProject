package basicJavaPrograms;

public class StrCount {

	public static void main(String[] args) {
 
		String str="Hello World";
		int count =0;
		System.out.println("Entered String is : "+str);
		
		//Count the charaters of the string except string
		
		for( int i=0; i< str.length(); i++)
		{
			if(str.charAt(i) != ' ')
				count++;
		}
		
		System.out.println("Total no of characters of string is : "+ count);
		

	}

}
