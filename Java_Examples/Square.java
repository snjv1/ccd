import java.util.Scanner;


class Square
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("enter eqtn to find roots");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
int d=  (b*b)- (4*a*c);

if (d<0)
{
System.out.println("no solution");
}

else if(d==0)
{
System.out.println("one solution");
System.out.println((-1*b/2*a));
}

else
{
System.out.println("two solution");
System.out.println(((-1*b) + (Math.sqrt(d)))/(2*a));
System.out.println(((-1*b) - (Math.sqrt(d)))/(2*a));
}

}
}

