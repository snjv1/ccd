/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjct1;

/**
 *
 * @author Sanjeev
 */
public class counter {
    public static void main(String[] args)
    {
        A ob1 =new A();
        A ob2 =new A();
        A ob3 =new A();
        ob1.show();
    }
    
    
}

class A
{
 static int i=0;
         public A()
         {
             i++;
         }
         
    public void show()
    {
        System.out.println(i);
                }
}