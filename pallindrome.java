import java.util.Scanner;

class pallindrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int no=n;
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		if(no==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}