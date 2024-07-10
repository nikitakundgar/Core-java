//Binary numbers addition

import java.util.Scanner;

public class BinaryAdd
{
	public static void main(String args[])
	{
        	Scanner s = new Scanner(System.in);
        System.out.print("Enter the binary numbers:");
        String num1 = s.nextLine();
        String num2 = s.nextLine();

        int n1 = Integer.parseInt(num1, 2);
        int n2 = Integer.parseInt(num2, 2);
        int sum = n1 + n2;
        String bsum = Integer.toBinaryString(sum);
        System.out.println("The sum of the two binary numbers is: " + bsum);
    }
}