/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dryrun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author sanje
 */
public class tra {
/*
static    class Human{
   //Overridden method
   public void eat()
   {
      System.out.println("Human is eating");
   }
}
static class Boy extends Human{
   //Overriding method
   public void eat(){
      System.out.println("Boy is eating");
   }
}
static class girl extends Human{
   //Overriding method
   public void eat(){
      System.out.println("girl is eating");
   }
}

   public static void main( String args[]) {
      Human obj = new Boy();
      //This will call the child class version of eat()
      obj.eat();
      
   }
}
    
*/    
    
    
    
    
    public static void main(String[] args) {
       int[] arr={1, 1,4,5,5,3,2,2, 5,2, 2, 3};
   
       HashMap<Integer,Integer> map = new HashMap<>();
       HashSet<Integer> set = new HashSet<>();
       
       
       for(int i :arr){
       //    map.put(i, map.getOrDefault(i, 0)+1);
       set.add(i);
       }
       
       for(int i :set)
       {
           if(i==2){
               System.out.println(i);
           }
       }
       
       for(Map.Entry<Integer,Integer> e : map.entrySet())
       {
           if( e.getValue()>2){
               System.out.println(e.getKey());
           }
       }
}
}
  
    
    
// String str = "Codility we test coders";
// int k=17;
// 
// String trim = str.substring(0,k);
// trim = trim.substring(0, Math.min(trim.length(), trim.lastIndexOf(" ")));
//         System.out.println(trim);

    
//    int[] A= {7, 1, 11, 8, 4, 10};
//      int M=8;
//      
//      HashSet<Integer> map = new HashSet<>();
//        for(int i=A.length-1; i>=1; i-- )
//        {
//            for(int j=i-1; j>=0; j--)
//            {
//                int num = Math.abs(A[i]-A[j]);
//                if(num%M == 0 )
//                {
//                    map.add(num);
//                }
//            }
//        }
//        System.out.println(map.size());
//    int k=3;
//    int[] result = solve(nums,k);
//    for(int i=0; i<result.length; i++)
//    {
//        System.out.print(result[i]+", ");
//    }
//
//
//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//    String line =br.readLine();
//    int count = Integer.parseInt(br.readLine());
//    
//    String[] ch = line.toLowerCase().split(" ");
//    HashMap<String, Integer> map =new HashMap<>();
//    for(String c: ch)
//    {
//        map.put(c , map.getOrDefault(c,0)+1);
//    }
//    
//    for(String c : ch)
//    {
//        if(map.containsKey(c))
//        {int value = map.get(c);
//        if(value>=count)
//        {
//            System.out.println(c);
//            map.remove(c);
//        }
//        }
//    }
//    
    
 
//
//        public static int[] solve(int[] nums,int k)
//        {            
//            
//        
//        Stack<Integer> st= new Stack<>();
//        int[] rb = new int[nums.length];
//        int[] result = new int[nums.length-k+1];
//        
//        rb[nums.length-1]=nums.length;
//        st.push(nums.length-1);
//        
//        for(int i=nums.length-2; i>=0 ; i--)
//        {
//            while( !st.isEmpty() && nums[i]>= nums[st.peek()])
//            {
//                st.pop();
//            }
//            if(st.isEmpty())
//            {
//                rb[i]=nums.length;
//            }
//            else
//            {
//                rb[i]=st.peek();
//            }
//            st.push(i);
//        }
//        
//        int j=0;
//        for(int i=0; i<=nums.length-k; i++)
//        {
//            if(j<i)
//            {
//                j=i;
//            }
//            while(rb[j]<i+k)
//            {
//                j=rb[j];
//            }
//            
//            result[i]=nums[j];
//            
//        }
//        return result;
//    }
//}
/* 
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String line =br.readLine();
    int n= Integer.parseInt(line.split(" ")[0]);
    int x= Integer.parseInt(line.split(" ")[1]);
    int y= Integer.parseInt(line.split(" ")[2]);
    
    int[] a= new int[n];
    int[] b= new int[n];
    
    String line2 =br.readLine();
    
    for(int i=0; i<n; i++)
    {
        a[i]=Integer.parseInt(line2.split(" ")[i]);
    }
    String line3 =br.readLine();
    for(int i=0; i<n; i++)
    {
        b[i]=Integer.parseInt(line3.split(" ")[i]);
    }
    
    System.out.println(x);
    System.out.println(y);
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
        
    }
    System.out.println("");
        for(int i=0;i<n;i++)
    {
 
        System.out.print(b[i]+" ");
    }
}
}*/



