//check wheather the given url is secure or not

import java.util.Scanner;

class url
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter url:");
		String str=s.next();
		if(str.startsWith("https"))
		{
			System.out.println("Valid url");
		}
		else
		{
			System.out.println("Not valid url");
		}
	}
} 