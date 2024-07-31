//Input all sides of a triangle and check whether the triangle is valid or not.

import java.util.Scanner;

class triangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the angles of triangle:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if((a+b+c)==180)
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
	}
}