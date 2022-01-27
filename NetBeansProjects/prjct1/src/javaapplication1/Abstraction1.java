package prjct1;
public class Abstraction1 
{
    public static void main(String[] args)
    {
        Ramesh obj=new Ramesh();
        obj.call();
        obj.move();
        obj.camera();
        obj.calculator();
    }
}
abstract class Mahesh{
    public void call()
    {
        System.out.println("calling.....");      
    }
    public abstract void move();
    public abstract void camera();
    public abstract void calculator(); 
    } 
abstract class Suresh extends Mahesh
{
    public void move()
    {
        System.out.println("moving.....");
    }
}
class Ramesh extends Suresh 
{
    public void camera()
    {
        System.out.println("camera.....");
    }
    public void calculator()
    {
        System.out.println("calculator.....");
    }
}
