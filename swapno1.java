//Swapping number without third variable

import java.util.Scanner;

class swapno1 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before swapping");
		System.out.println("a:"+a+"\nb:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a:"+a+"\nb:"+b);
	}
}