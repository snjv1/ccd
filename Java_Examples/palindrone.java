import java.util.Scanner;

class palindrone
{
public static void main(String args[])
{

int r,t,s=0;

 Scanner sc = new Scanner(System.in);
 System.out.println("enter no to find its palindrone");
 int no = sc.nextInt();
t=no;             // save no in new variable to check after while loop//
while(no>0)
{
r=no%10;
no=no/10;
s=s*10+r;
}
if(t==s)
{
System.out.println("NO is Palindrone");
}
else
{
System.out.println("no is NOT palindrone");
}
}
}
