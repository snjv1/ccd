import java.util.Scanner;

class fibonacci
{
public static void main(String[] a)
{
 int b=0,c=1,sum=0;
 Scanner sc =new Scanner(System.in);
System.out.println("enter no upto you want fibonacci series");
 int num= sc.nextInt();


System.out.println(b);
System.out.println(c);
for(int count=1;count<=num-2;count++)
{ 
sum=b+c;
b=c;
c=sum;
                         //   if(sum>=num)//
                         //   break;// this method use if u want to print no before them for ex fibonacci series before 75 or before 50 etc
System.out.println(sum);
}
}


}