/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassFile;

/**
 *
 * @author Sanjeev
 */
public class Aggregation {
    
    
    public static void main(String args[]){  
	   Circle c=new Circle();  
	   double result=c.area(5);  
	   System.out.println(result);  
	 } 
    
    int square(int n){  
	  return n*n;  }  
	}  

class Circle{  
	 Aggregation op;//aggregation  
	 double pi=3.14;  
	 double area(int radius){  
	   op=new Aggregation();  
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
	   return pi*rsquare;  
           
	 }        
}
