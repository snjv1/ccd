
package Serializatn;

import java.io.*;

public class Serializtn {
    public static void main(String[] args) throws Exception
    {
        B ob=new B();
        ob.id=23;
        ob.name="sanjeev";
        File f=new File("obj.text");
        FileOutputStream fos =new FileOutputStream(f);
        ObjectOutputStream ops =new ObjectOutputStream(fos);
        ops.writeObject(ob);
        
        
        
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
         B a=(B) ois.readObject();
        System.out.println("text affter decryption is"+a);
     
        
        
    }
    
}
class B implements Serializable
{
    int id;
    String name;
}
