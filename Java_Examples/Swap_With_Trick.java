class Swap_With_Trick
{
	public static void main(String[] args)
	{
		int a=5,b=7;
		b=a+b-(a=b);
		System.out.println("value of a is " +a+ " value of b is "  +b);
	}
}
