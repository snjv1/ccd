/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjct1;
import java.util.*;

public class Encapsulation {
    public static void main(String[] args)
    {
        Sum obj=new Sum(); 
       System.out.println("enter id "); 
       System.out.println("enter name  ");
        obj.setId(5);
        obj.setName("sanjeev");
        
         System.out.println(obj.getId());
             System.out.println(obj.getName());
       
       obj.getName();        }}


class Sum
{
    private int id;
    private String name;
    
    public void setId(int id){
        this.id=id;}
    
    public int getId(){
        return id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
   
    
}
