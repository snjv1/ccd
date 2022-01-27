/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassFile;
import java.util.Scanner;

/**
 *
 * @author Sanjeev
 */
public class example {
    public static void main(String[] args) {
   circle c1=new circle();
   c1.display();
}
}
    
    

class circle{
int r=0;
String c;
circle(){
     System.out.println("Enter radius and centre");
    Scanner sc=new Scanner(System.in);
     r=sc.nextInt();
     c=sc.next();
}
public void display(){
    System.out.println("Radius is "+r+" and centre is "+c);
}
}



    
