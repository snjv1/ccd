
class vinni
{
public static void main(String[] a)
{
int n=65;
for(int i=1;i<=4;i++)	
{
	for(int j=1;j<=4;j++)
	{
if(i>=j)
{
int k=n+j-1;
char c= (char)k;
System.out.print(c+ " ");
}

else
{ int k=n+14+j-1;
char c= (char)k;
System.out.print(c+ " ");
}
}
System.out.println();

}
}
}