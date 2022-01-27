
class rows 
{
public static void main(String[] a)
{
for(int i=1;i<=4;i++)	
{
	for(int j=1;j<=4;j++)
	{	
		if(i==1||i==4||j==1||j==4)
		{
			System.out.printf("*");	
		}

		else
			System.out.print(" ");
	}
	System.out.println();
}
}
}