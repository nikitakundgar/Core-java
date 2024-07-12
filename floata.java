//sort float array in ascending & descending

import java.util.Scanner;

class floata
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of element:");
		int n=s.nextInt();

		float a[]=new float[n];

		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextFloat();
		}
	
		System.out.println("Array element");
		for(int i=0;i<n;i++)
		{
		
			System.out.print(a[i]+"\t");
		}
		int j;
		System.out.println("\nDscending order array");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					float temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.print(a[j]+"\t");
		}
		System.out.println("\nAscending order array");
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					float temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.print(a[j]+"\t");
		}
	}	
}