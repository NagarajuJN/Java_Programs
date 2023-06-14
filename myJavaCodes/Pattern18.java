package myJavaCodes;

/*
             1 
         2 1 2 
      3 2 1 2 3 
   4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 

 */

import java.util.*;
public class Pattern18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  number of row:");
		int num = scan.nextInt();
		 	show (num);
	}

	static void show(int n) {
		for(int i=1;i<=n;i++) 
		{
			for(int k = 0; k<n-i;k++) 
			{
				System.out.print("   ");
			}
			
			for(int j = i;j>=1;j--) 
			{
				System.out.print(j+" ");
			}
			
			for(int j = 2 ; j<=i ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
		
		for(int i=1;i<=n-1;i++) 
		{
			int c = i>n ? 2*n-i:i;
			
			for(int k = 0; k<n-c;k++) 
			{
				System.out.print("   ");
			}
			
			for(int j = c ;j>=1;j--) 
			{
				System.out.print(j+" ");
			}
			
			for(int j = 2 ; j<=c ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
		

	}
}

