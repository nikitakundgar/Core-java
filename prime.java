import java.util.Scanner;

class prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int flag=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag++;
			}
		}
		if(flag==1)
		{
			System.out.println("number is prime");
		}		
		else
		{
			System.out.println("number is not prime");
		}
	}
}