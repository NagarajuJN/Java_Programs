package myJavaCodes;
/*

*****
****
***
**
*

*/

import java.util.Scanner;

public class Pattern13 {

	public  static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a number row:");
		 int n = scan.nextInt();
		 for(int i  = 1 ; i<=n;i++)
		 {
			 for(int k = 1 ;k ==n;k++)
			 {
				 System.out.print("  ");
			 }
			 for(int j =1 ;j<=n-i+1; j++ )
			 {
			 System.out.print("*");
		      }
			 
			 System.out.println();

		 }
		 
	}
}
