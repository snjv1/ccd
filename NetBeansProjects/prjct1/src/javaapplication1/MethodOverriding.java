package prjct1;
public class MethodOverriding 
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.show();
    }  
}
class A
{
    public void show()
    {
         System.out.println("in const A");
    }
}
 class B extends A
 {
     public void show()
     {
         super.show();
        System.out.println("in const B");
     }
 }
