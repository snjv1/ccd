package dp__greedy;

import java.util.Scanner;

public class arrangeBuilding__13 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        /*
        input  6
        output  441
        */
        
       int ob = 1;      //olde building
      int os = 1;           //old spaces
      for(int i = 2; i <=n; i++){
         int newbuilding = os;             //new building nb
         int newspace = os + ob;     //new space ns

         ob = newbuilding;
         os = newspace;
      }

      int total = ob + os;  //total ways of one side
       
      int totalWays = total*total;      // total ways of both side
        System.out.println(totalWays);
        
    }
}
