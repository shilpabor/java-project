package for_loop;

public class equal_class {
	
	public static void main(String[]args)
	{
		String str1="school";     //constant pool area
		String str2="school";
		String str3=new String ("school");   //non constant pool area
		String str4=new String("school");
		
		
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		System.out.println(str1==str2);
		System.out.println(str3==str4);
	}

}
