package for_loop;

public class reverse_class { 
	
	
	public static void main(String[]args)
	{
		String str="monday";
		String reversestr ="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reversestr=reversestr+str.charAt(i);
		}
		if (str.equals(reversestr))
		{
			System.out.println("string is pallendrom");
		}
		else 
		{
			System.out.println("string is not pallendrom");
		}
	}
	
}