import java.util.Scanner;

class EnhancedFor2d
{
public static void main(String[] args)
{

int row,col;
int arr[][]=new int[][];
Scanner sc = new Scanner(System.in);

System.out.println("enter the no of rows");
row = sc.nextInt();
System.out.println("enter the no of column");
col = sc.nextInt(); 



System.out.print("enter elements of  Array ");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr[i][j]= sc.nextInt();
}
}


for(int i[] : arr)
{
	for(int j : i)
	{
	System.out.print(j+ " ");
	}	
	System.out.println("");
}



s




//System.out.print("Array is ");
//for(int i=0;i<row;i++)
//{
//for(int j=0;j<col;j++)
//{
//System.out.print(arr[i][j]+ " ");
//}
//System.out.println();
//}



}
}