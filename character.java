//character is an lowercase/uppercase/special character/digit

import java.util.Scanner;

class character
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=s.next().charAt(0);
	
		if(Character.isUpperCase(ch))
		{
			System.out.println("Character is in uppercase");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println("Character is in lowercase");
		}
		else if(Character.isLetterOrDigit(ch))
		{
			System.out.println("Character is digit");
		}
		else
		{
			System.out.println("Character is special character");
		}
	}
}