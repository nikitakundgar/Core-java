//number isi divisible by 5 & 11 or not

import java.util.Scanner;

class divisible
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		if((n%5==0) && (n%11==0))
		{
			System.out.println("Number is divisible by 5 & 11");
		}
		else
		{
			System.out.println("Number is not divisible by 5 & 11");
		}
	}
}