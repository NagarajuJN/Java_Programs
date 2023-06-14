package myJavaCodes;

import java.util.Scanner;

public class CountNumber_of_Digit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Element:");
		int num = scan.nextInt();
		
		int count =0;
		while(num!=0)
		{
			num = num/10;
			count ++;
		}
		System.out.print(count);
	}
	

}
