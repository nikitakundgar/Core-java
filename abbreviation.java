//person's name abbreviation

import java.util.Scanner;

class abbreviation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first name:");
		char fn=s.nextLine().charAt(0);
		System.out.println(fn);
		System.out.println("Enter middle name:");
		char mn=s.nextLine().charAt(0);
		System.out.println("Enter last name:");
		char ln=s.nextLine().charAt(0);
		System.out.println("Person's Name Abbreviation is:"+fn+"."+mn+"."+ln);
	}
}