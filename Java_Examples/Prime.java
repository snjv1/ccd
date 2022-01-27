import java.util.Scanner;
class Prime
{
public static void main(String[] a)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter no to checck it is prime or not");
int n =sc.nextInt();
boolean Prime= true;


for(int i=2;i*i<=n;i++)
{
if(n%i==0)
{
 Prime=false;
break;
}
}
 if(n<2) 
Prime=false;
System.out.println("Prime" + Prime);

}}
