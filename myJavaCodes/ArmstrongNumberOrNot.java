package myJavaCodes;
import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter a  number:");

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int digit   ,temp;
		double res = 0 ;
		 temp=num;
		
	
//	int power=0;
//	while(num!=0)
//	{
//		num = num/10;
//		power ++;
//	}
//	System.out.println(power);
		
		while(num!=0)
		{
			digit = num%10;
			res = res+Math.pow(digit, 3);
			num=num/10;
		}
		System.out.println(res);

	
		if(res==temp)
		{
			System.out.println("Is a Armstrog number:");
		}
	
		else {
			System.out.print("IS Not a Armstrong Number");
		}
		
	}

}
