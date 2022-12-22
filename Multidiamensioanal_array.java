package for_loop;

import java.util.Arrays;


class Multidiamensioanal_array {
	
	public static void main(String[]args)
	{
		int [][][]a=new int[3][4][4];
		
		a[0][0][0]=10;
		a[0][1][1]=20;
		a[0][2][2]=30;
		a[0][3][3]=40;
		a[1][0][0]=11;
		a[1][1][1]=22;
		a[1][2][2]=33;
		a[1][3][3]=44;
		a[2][0][1]=55;
		a[2][1][2]=66;
		a[2][2][3]=77;
		a[2][3][0]=88;
		 
		
	//	int [][]b=new int[][] {{12,13,14},{15,16,17},{18,19,20}};
		
		System.out.println(a.length);
	//	System.out.println(b.length);
		System.out.println(Arrays.deepToString(a));
	//	System.out.println(Arrays.deepToString(b));
		
	//	for(int i=0;i<3;i++)
	//	{
	//	  for(int j=0;j<a[i].length;j++)
	//	  {
	//		  System.out.print(a[i][j]+"     ");
	//	  }
	//	System.out.println();
		
		
	}
}

