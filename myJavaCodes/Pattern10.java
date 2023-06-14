package myJavaCodes;
/*
 
1  2  3  4  5  
6  7  8  9  10  
11  12  13  14  15  
16  17  18  19  20  


*/

import java.util.Scanner;

public class Pattern10 {

	public  static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a number row:");
		 int n = scan.nextInt();
		 int  count = 0;
		 for(int i  = 1 ; i<=n;i++)
		 {
//			 for(int j = 1 ;j <=n; j++ )
//			 {
				
				 System.out.print(i+"  ");
				 count++;
				 if(count==5 || count ==10 || count==15|| count==20) {
					 System.out.println();
				 }
		      
		 }
		 
	}
}
