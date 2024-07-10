//print Ascii value of character

import java.util.Scanner;

class asciiValue
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=s.next().charAt(0);
		int asciiv=ch;
		System.out.println("Ascii value of " +ch+ " is: "+asciiv);
	}
}