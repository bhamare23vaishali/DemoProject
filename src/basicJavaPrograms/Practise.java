package basicJavaPrograms;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str="beautiful beach";
			char carry[]=str.toCharArray();
			System.out.println("String is: "+str);
			System.out.println("Duplicte chara in string is:");
			
			for(int i=0;i<carry.length;i++)
			{
				for(int j=i+1;j<carry.length;j++)
					if(carry[i]==carry[j])
							System.out.println(carry[j]);
		
		}
	}

}
