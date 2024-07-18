import java.util.Scanner;

class posnegNo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("Number is positive");
		}
		else if(n<0)
		{
			System.out.println("Number is negative");
		}
		else 
		{
			System.out.println("Number is zero");
		}
	}
}