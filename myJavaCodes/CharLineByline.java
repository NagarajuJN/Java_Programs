package myJavaCodes;

import java.util.Scanner;

public class CharLineByline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an String:");
		String s = scan.nextLine();
		
		for(int  i = 0 ; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}

	}

}
