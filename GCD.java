//gcd of two number

import java.util.Scanner;

class GCD  
{  
	public static void main(String args[])   
	{  
		int temp, gcd=0;  	
		Scanner s=new Scanner(System.in);

		System.out.println("Enter two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		while(num2 != 0)  
		{  
			temp = num2;  
			num2 = num1 % num2;  
			num1 = temp;  
		}  
		gcd = num1;  
		System.out.println("\nGCD=" + gcd);  
	}  
}  