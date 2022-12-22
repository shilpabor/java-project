package for_loop;

public class paractic_logic {
	
	public static void main(String[]args)
	{
	 String str="01010";
	 String reversestr="";
	 
	 for(int i=str.length()-1;i>=0;i--)
	 {
		 reversestr=reversestr+str.charAt(i);
	 }
	if (str.equals(reversestr))
			{
		System.out.println("pallindrom");
			}
	else
	{
		System.out.println("not pallindrom");
	}
		
	}

}
