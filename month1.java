//input month no and print no of days in the month

import java.util.Scanner;

class month1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the month number:");
		int n=s.nextInt();
		
		if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)
		{
			System.out.println("Number of days in "+n+" month is: "+31);
		}
		else if(n==4||n==6||n==9||n==11)
		{
			System.out.println("Number of days in "+n+" month is: "+30);
		}
		else
		{
			System.out.println("Number of days in "+n+" month is: "+28);
		}
	}
}