//2d matrix display print

import java.util.Scanner;

class matrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows and columns:");
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n]; 
		System.out.println("Enter array element");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Matrix is:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
		