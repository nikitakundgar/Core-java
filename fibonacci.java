//Fibonacci series upto n

import java.util.Scanner;

class fibonacci
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of series:");
		int n=s.nextInt();
		int a=0;
		int b=1;
	
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
