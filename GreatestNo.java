//greatest number among 3 number

import java.util.Scanner;

class GreatestNo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 3 numbers:");
		int no1=s.nextInt();
		int no2=s.nextInt();
		int no3=s.nextInt();
		
		if((no1>no2)&&(no1>no3))
		{
			System.out.println("No1 is greatest number");
		}
		else if((no2>no1)&&(no2>no3))
		{
			System.out.println("No2 is greatest number");
		}
		else
		{
			System.out.println("No3 is greatest number");
		}
	}
}