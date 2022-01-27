
package prjct1;

public class ConstructorOverloading 
{   
    public static void main(String[] args)
    {    
       Ab obj = new Ab(5,6.2); 
      
    }
 }
//example of constructor overloading
class Ab
{
    Ab()
    {
        System.out.println( "constructor with no arguments");
    }
    
    
    Ab(int a,int b)
    {
     System.out.println( "constructor with parameter");
    }
    
    Ab(int a,double b)
    {
     System.out.println( "constructor with another parameter");
    }
    

}

