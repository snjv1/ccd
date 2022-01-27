package prjct1;
import java.util.*;
public class SingleInheritance 
{
    public static void main(String[] args)
    {
      System.out.println("enter two no a and b");
      Scanner sc=new Scanner(System.in);
      int a =sc.nextInt();
      int b=sc.nextInt();
       AddSub obj=new AddSub();
       obj.sum(a,b);
       obj.Sub(a, b);
      
      
      
    }
    
}

class Add
{
    int result;
    public void sum(int a,int b)
    {
        result=a+b;
        System.out.println(result);        
    }
}

class AddSub extends Add
{
   public void Sub(int a,int b)
   {
       result=a-b;
        System.out.println(result);
   }
   }