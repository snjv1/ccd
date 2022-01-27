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
public class UseStatic
{
    static
            {
                    
     Abc.i=5;
     Abc.show();
     
            }
 public static void main(String[] args)
 {
   

 }
}

class Abc
{
    static int i;
    public static void show()
    {
        System.out.println(i);
    }
}



