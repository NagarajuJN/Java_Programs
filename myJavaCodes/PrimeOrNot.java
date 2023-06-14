package myJavaCodes;
	import java.util.Scanner;
	public class PrimeOrNot {
			
		public static void main(String [] args)
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter an Element:");
			int num = scan.nextInt();
			
				int flag = 0;
				
				if(num>1)
				{
				for(int i =2;i<num;i++)
				{
					if(num%i==0) 
					{
						flag=0;
						break;
					}
					else {
								flag=1;
							}
				}
			}
				else {
					System.out.println("Enter a vaild number");
					}
				
		if(flag==1) {
			System.out.println("is a  prime number :"+true);
			}
		else {
			System.out.println("Not  a  prime number :"+false);

		}
			
			
			
			System.out.println(num);
		}
	}

