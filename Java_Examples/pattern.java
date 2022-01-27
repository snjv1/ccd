class pattern
{
	public static void main (String a[])
	{
		sanjeev:             // this is label used for label break
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i==3)
					break sanjeev;  //label break aftter this no cloumn and row get printed
				System.out.print("* ");
			}
			System.out.print("\n"); 
		}
	} 

}