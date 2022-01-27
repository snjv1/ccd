/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassFile;
import java.util.*;
import java.io.*;

public class CountWrdsLines {
    public static void main(String[] args)   throws FileNotFoundException
    {
       File myfile =new File("C:\\Users\\Sanjeev\\Desktop\\abc.txt");
        Scanner sc =new Scanner(myfile);
        int lines=0,words=1,alphabets=0;
        while(sc.hasNextLine())
        {
            String s= sc.nextLine();
            for(int i=0;i<s.length();i++)
            {
                int j=s.charAt(i);
                if((j>64 && j<92)||(j>96 && j<123))
                { alphabets++;
                 }
                else if(j==32)
                    words++;
            }
            lines++;         
            
        }
        System.out.println(lines  + "\n" + alphabets +"\n" + words);
        
      
     
        }
    }




        
        
//        System.out.println("enter no");
//        Scanner sc =new Scanner(System.in);
//        
//        i=Integer.parseInt(sc.nextLine());
//        System.out.println(i);
//        
//        
//    String str="Sanjeev,monu ,yash ,uncle";
//   String names[]=str.split(",");
//        System.out.println(names[2]);
    
 
    

