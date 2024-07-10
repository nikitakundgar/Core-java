//Area and circumference of circle

import java.util.Scanner;

class circle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		double r=s.nextDouble();
		double pi=3.14;
		double area=pi*(r*r);
		double circum=2*(pi*r);
		System.out.println("Area of circle: "+area);
		System.out.println("Circumference of circle: "+circum);
	}
}