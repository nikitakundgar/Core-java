//Given character is  alphabet or not without predefined functions 

import java.util.Scanner;

class charOrNot
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		if((ch>=65) && (ch<=122))
		{
			System.out.println("Given character is an alphabet");
		}
		else
		{
			System.out.println("Given character is not an alphabet");
		}
	}
}