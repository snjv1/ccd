package FileHandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws Exception
    {
        File f=new File("hello.txt");
        FileOutputStream fos =new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF(" hello world here is Sanjeev");    // E:\JAVA netbeans\StarPttrn
        
        // to read that file in output screen
        
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        String str= dis.readUTF();
        System.out.println(str);
        
        
    }
    
}
