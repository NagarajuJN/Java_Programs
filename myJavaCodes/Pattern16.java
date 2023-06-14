package myJavaCodes;
 
/*
 
*
**
***
****
*****
        *
      **
    ***
  ****
*****

 */
import java.util.Scanner;
public class Pattern16 {
	public static void main(String[] args) {
		
		int i , j , k , n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number of row u want:");
		 n = scan.nextInt();
		
		for(i = 1 ; i<=n ; i++)
		{
			for(j = 1 ; j <=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		 for( i  = 1 ; i<=n;i++)
		 {
			 for( k = 1 ;k<=(n-1)-i+1;k++)
			 {
				 System.out.print("  ");
			 }
			 for( j =1 ;j<=i; j++ )
			 {
			 System.out.print("*");
		      }
			 
			 System.out.println();

		 }

	}
}
