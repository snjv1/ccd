class EnhancedFor3
{
public static void main(String[] args)
{
int arr[][][]=new int[4][4][4];

for(int i=0;i<4;i++)
{
	for(int j=0;j<4;j++)
	{
		for(int k=0;k<4;k++)
		{
			arr[i][j][j]=i+j+k;
		}	
	}

}

for(int i[][] : arr)
{
	for(int j[] : i)
	{
		for(int k : j)
		{
			System.out.print(" " + arr);
		}
	}
}






}
}