//Fibonacci series

import java.util.Scanner;

class fibonacci
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int a=0,b=1;
		System.out.print(a+"\t");
		System.out.print(b+"\t");
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}