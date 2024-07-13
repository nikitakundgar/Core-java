import java.util.Scanner;

class power 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=s.nextInt();
		int p=no*no;
		System.out.println("Power of"+no+" is:"+p);
	}
}