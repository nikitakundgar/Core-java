//Minimum and maximum element in array

import java.util.Scanner;

class minmaxarray
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int min=0,max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array element:");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();		
		}
		int mx=a[0];
		int mn=a[0];
		for(int i=0;i<5;i++)
		{
			max=(a[i]>mx)?mx:a[0];
			min=(a[i]<mn)?mn:a[0];
		}
		System.out.println("Maximum element in array"+max);
		System.out.println("Minimum element in array"+min);
	}
}