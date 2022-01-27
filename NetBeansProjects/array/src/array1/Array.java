package array1;

import java.util.Scanner;
 
public class Array
{
public static void main(String[] args)
{
for (int i = 0; i <= 7; i++)
{
    System.out.println();
   for (int j = 1; j <= 7-i; j++)
   {
       System.out.print( j + " ");
   }
  
}
for (int i = 0; i<7; i++)
{
    System.out.println();
   for (int j = 0; j <= i; j++)
   {
       System.out.print( j+1 + " ");
   }
   
}
}
}