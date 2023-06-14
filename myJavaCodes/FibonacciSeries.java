//normal way 

package myJavaCodes;
import java.util.Scanner;

/*
public class FibonacciSeries {

	public static void main (String[ ] args)
	{

	System.out.println("Enter an nth number:");
	Scanner scan = new Scanner(System.in);
	 int n1=0,n2=1,n3,i,count=10;    
	 System.out.println(n1);// 
	 System.out.println(n2);//printing 0 and 1    

	 for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.println(n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	  
	}}  
	
	*/


// Using the Recursion

public class FibonacciSeries {

	static int n1=0,n2=1,nth=0;
	
	static void printFibonacci(int num)
	{
		if(num>0)
		{
			nth = n1+n2;
			n1=n2;
			n2=nth;
			System.out.println(nth);
			
			printFibonacci(num-1);
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter an nth number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
	
		System.out.println(n1);
		System.out.println(n2);
		
		printFibonacci(num-2);
	}
	
}


