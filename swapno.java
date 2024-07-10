//Swapping number using third variable

class swapno 
{
	public static void main(String args[])
	{
		int a=3;
		int b=2;
		System.out.println("Before swapping");
		System.out.println("a:"+a+"\nb:"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("a:"+a+"\nb:"+b);
	}
}