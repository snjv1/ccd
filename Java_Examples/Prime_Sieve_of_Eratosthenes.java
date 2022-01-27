import java.util.Scanner;

class Prime_Sieve_of_Eratosthenes
{
public static void main(String[] a)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter no to check prime no upto N");

int n =sc.nextInt();
int prime[]=new int[100];


for(int i=2; i <=n; i++)
{
	if(prime[i]==0)
	{
		for(int j=i*i; j<=n; j=j+i)
		{
			prime[j]=1;
		}
	}
}

for(int i=2;i<=n;i++)
{
if(prime[i]==0)
{
System.out.print(i+" ");
}
}

}
}


