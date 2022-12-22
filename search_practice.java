package for_loop;

public class search_practice {
	
	public static void main (String[]args)
	{

	String input="aaaaabbbabbajjha";
	char search='a';
	int count='0';
	for(int i=0;i<input.length();i++);
	{
		if(input.charAt(i)==search)
		count++;
			
	}
	System.out.println(count);
}
}


