//character is vowel or consonent

import java.util.Scanner;

class vowelCon
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=s.next().charAt(0);
		
		if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Given character is vowel");
		}
		else
		{
			System.out.println("Given character is consonent");
		}
	}
}