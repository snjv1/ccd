package prjct1;
public class Abstraction2 {
    public static void main(String[] args) {
        Samsung obj=new Samsung();
        Iphone obj1 =new Iphone();
        show(obj1);
    }
    public static void show(Phone a) {
        a.showconfig();
    }
    
}
abstract class Phone
{
    public abstract void showconfig();
}
class Iphone extends Phone
{
    public void showconfig()
    {
        System.out.println("8 GB ram A13 chip Iphone 11 pro");
    }
}
class Samsung extends Phone
{
    public void showconfig()
    {
        System.out.println("4 GB ram LOLIPOP version 9.5");
    }
}