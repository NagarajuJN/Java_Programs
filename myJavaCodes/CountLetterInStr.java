package myJavaCodes;

import java.util.Scanner;

public class CountLetterInStr {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter an String:");
			String s = scan.nextLine();
			 int count = 0;
			for(char ch : s.toCharArray()) {
				count ++;
			}
			System.out.print("No of Letters in Str:"+count);


	}
	

}
