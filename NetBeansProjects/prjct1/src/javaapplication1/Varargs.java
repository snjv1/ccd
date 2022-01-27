
package prjct1;
class Varargs {
 
 static public void main(String[] args) 
{
    Display obj = new Display();
    obj.show(8,3,5);
}
}

class Display
{    public void show(int... a)
    {
        for(int i : a)
        {
       System.out.println(i);
    }
}

    
}
  