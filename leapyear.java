//leap year

import java.util.Scanner;

class leapyear
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year:");
		int y=s.nextInt();
		if(y%4==0 && (y%100!=0 || y%400==0))
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
	}
}