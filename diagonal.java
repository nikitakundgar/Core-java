//matrix diagonal sum

import java.util.Scanner;

class diagonal
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];

		System.out.println("Enter array element");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		System.out.println("Array element");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Addition of diagonal element is:"+sum);
	}
}