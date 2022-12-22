package for_loop;

public class occurrence_method {

	public static void main(String[]args)
	{
		String input="aaabbhdjddjjjjj";
		char search='j';
		int count=0;
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==search)
				count++;	
		}
		System.out.println("occurence of"+" "+search+" "+"is"+" "+count);
		
	}
}
