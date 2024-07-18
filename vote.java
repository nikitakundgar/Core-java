//voting eligibility checker

import java.util.Scanner;

class vote
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age");
		int a=s.nextInt();
		if(a<18)
		{
			System.out.println("Not a valid age to vote");
		}
		else
		{
			System.out.println("Valid age to vote");	
		}
	}
}