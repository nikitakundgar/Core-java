//2d array(matrix) each row & column addition 

import java.util.Scanner;

class matrix1
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
		System.out.println("Matrix is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++)
		{
			int sumr=0,sumc=0;
			for(int j=0;j<3;j++)
			{
				sumr=sumr+a[i][j];
				sumc=sumc+a[j][i];
			}
			System.out.println("Sum of "+(i+1)+"st row element is:"+sumr);
			System.out.println("Sum of "+(i+1)+"st column element is:"+sumc);
		}
	}
}