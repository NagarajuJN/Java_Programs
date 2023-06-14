package myJavaCodes;
import java.util.*;

public class Reverse_String {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an String:");
		String s = scan.next();
//		int l = s.length();
		
		int count = 0;
		for(char ch :s.toCharArray())
		{
			count++;
		}
		
		System.out.println(count);
		
		String empt_Str=" ";
		
		for(int i =count-1;i>=0;i--) {
			empt_Str=empt_Str+s.charAt(i);

			if(i%2!=0) 
				System.out.println(s.charAt(i)+" ");
			
		}
		System.out.println(empt_Str);
	}

}
