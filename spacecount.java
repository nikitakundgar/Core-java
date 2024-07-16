import java.util.Scanner;

class spacecount
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=s.nextLine();
		int count=1;

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')	
			{
				count++;
			}
		}
		System.out.println(count);
	}
}