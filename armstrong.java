//Armstrong number or not(3 digit no)

import java.util.Scanner;

class armstrong
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=s.nextInt();
		int rem,sum=0;

		int originalNo=no;

		while(originalNo!=0)
		{
			rem=originalNo%10;
			sum=sum+(rem*rem*rem);
			originalNo=originalNo/10;
		}		
		if(no==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}
}