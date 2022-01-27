class Swap
{
public static void main(String[] a)
{
int temp,b=5,c=6;

//a=a+b;
//b=a-b;
//a=a-b;


a=a^b;
b=a^b;
a=a^b;



//temp=b;
//b=c;
//c=temp;
System.out.println("b : "+ b);

System.out.println("c : "+ c);
}
}
