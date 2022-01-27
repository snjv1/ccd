import java.util.Scanner;

class Perfect_no
{

public static void main(String a[])
{ 
Scanner sc= new Scanner(System.in);
System.out.println("enter no to find if it is perfect or not");
int n =sc.nextInt();


boolean b = Perfect(n);
if(b)
	System.out.println("No is Perfect");
else
	System.out.println("NOT Perfect");
}

public static boolean Perfect(int n)
{ int sum=0;
for (int i=1;i<n/2;i++)
{	
	if(n%i==0)
	sum +=i;
}
if(n==sum)
	return true;
else
return false;
}
}