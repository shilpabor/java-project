package for_loop;

public class String_class {
	public static void main(String[]args) {
		  
		  
		  String str = "monday";      // stored in constant pull area
		  String str1 = "sunday";

		 String str2 = new String("sunday");  //  stored in non constant pull area
		 String str3=" ";
		 
		 System.out.println(str.length());
		 System.out.println(str2.charAt(3));
		 System.out.println(str.indexOf("a"));
		 System.out.println(str1.toUpperCase());
		 System.out.println(str.trim());
		 System.out.println(str.concat(str1));
		 String newstr=str.concat(str1);
		 System.out.println(newstr.toUpperCase());
		 System.out.println(str3.isBlank());
         System.out.println(str3.isEmpty());
         System.out.println(str.equals(str1));
         System.out.println(str.startsWith("m"));
         System.out.println(str1.endsWith("y"));
}
}
