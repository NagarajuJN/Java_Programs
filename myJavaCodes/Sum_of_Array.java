package myJavaCodes;

import java.util.*;
public class Sum_of_Array{
//	 static int [] arr = {10,20,30,40};

 static int  add( int[] arr) {
	 
	int n =arr.length;
	int sum = 0;
	for(int i = 0; i <n; i++) {
		
		sum  = sum + arr[i];
	}
		return  sum;
	
 }
public static void main(String[] args) {


	int a[] = new int[5];
	for(int i = 0; i<a.length ; i++)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ele to be add:");
          int ele = sc.nextInt();
        a[i]=ele;
	}
	for(int i = 0; i<a.length ;i++) {
		System.out.print(a[i]);
	}
	System.out.println();
	
		System.out.println("sum of the ele of an array is:"+add(a));

		}

}
