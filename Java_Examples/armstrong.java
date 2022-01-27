import java.util.Scanner;
class armstrong
{
public static void main(String[] a)
{
int sum=0,r,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no to find it is armstrong or not");
int n = sc.nextInt();
 temp=n;
while(n>0)
{
r=n%10;
n=n/10;
sum=sum+r*r*r;
}
if(sum==temp)
System.out.println("No is armstrong");
else
System.out.println("It is NOT armstrong");


} 
}