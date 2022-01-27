/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanjeev
 */
  import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t1=sc.next();
        int t=Integer.parseInt(t1);
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
           for(int j=0;j<n;j++)
           {
           		int x=a;
           		for(int k=0;k<=j;k++)
           		{
           			x=x+(int)Math.pow(2,k)*b;
           		}
           		System.out.print(x+" ");	
           }
           System.out.println(); 
        } 
    }
}