import java.util.Scanner;

class arrays
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array element:");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter element to search:");	
		int sr=s.nextInt();
		for(int i=0;i<5;i++)
		{
			if(a[i]==sr)
			{
				count++;
			}			
		}
		
		if(count!=0)
		{
			System.out.println("Count of "+sr+" in array is"+count);
		}
		else
		{
			System.out.println("Element is not in a array");
		}
	}
}
