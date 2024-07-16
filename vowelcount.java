//count vowel consonant in string

import java.util.Scanner;

class vowelcount
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=s.nextLine();
		int v=0,c=0;
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("vowel: "+v);
		System.out.println("consonant: "+c);
	}
}