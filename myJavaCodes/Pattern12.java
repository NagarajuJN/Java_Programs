package myJavaCodes;
/*
          *
        **
      ***
    ****
  *****
*/

import java.util.Scanner;

public class Pattern12 {

	public  static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a number row:");
		 int n = scan.nextInt();
		 for(int i  = 1 ; i<=n;i++)
		 {
			 for(int k = 1 ;k<=n-i+1;k++)
			 {
				 System.out.print("  ");
			 }
			 for(int j =1 ;j<=i; j++ )
			 {
			 System.out.print("*");
		      }
			 
			 System.out.println();

		 }
		 
	}
}
