package myJavaCodes;
/*
 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

*/

import java.util.Scanner;

public class Pattern7 {

	public  static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a number row:");
		 int n = scan.nextInt();
		 for(int i  = 1 ; i<=n;i++)
		 {
			 for(int j = 1 ;j<=n; j++ )
			 {
			 System.out.print(j+" ");
		      }
			 System.out.println();

		 }
		 
	}
}
