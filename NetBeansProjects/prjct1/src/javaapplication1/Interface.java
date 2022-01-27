package prjct1;
public class Interface {
    public static void main(String[] args) {
    
    Abc obj= new Abd();
    obj.show();
    }
}

interface Abc
{
    void show();
}

class Abd implements Abc
{
    public void show()
    {
        System.out.println("hi show");
    }
}
