package prjct1;
public class ObjCrtnInInheritanceConstructor 
{
    public static void main(String[] args)
    {
        B obj=new B(5);
    }
}

class A
{   public A()
    {
    System.out.println("in A const");
    }
    public A(int n)
    {
        System.out.println("in A const int"); 
    }
}

class B extends A
{
    public B()
    {
      
    System.out.println("in b const");
    }
    
    public B(int n)
    {
        super(9);
        System.out.println("in b const int"); 
    }
}