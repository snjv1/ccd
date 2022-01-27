package recursionInArraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class getStairPath__3 
{
    public static void main(String[] args) 
    {
        /*
        1. You are given a number n representing number of stairs in a staircase.
        2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
        */
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        ArrayList<String> words= getStairPaths(n);
        System.out.println(words);
    }
 
    
    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0)
        {
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n<0)
        {
            ArrayList<String> bres= new ArrayList<>();
            return bres;
        }
        
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        
        ArrayList<String> result = new ArrayList<>();
        
        for(String path : paths1)       //let n =4 to n-1(3 se 0) path walo ke muh p 1 add krdo jisse 4 tk phuch jaye
        {
            result.add(1 + path);
        }
    
        for(String path : paths2)       //let n =4 to n-2(2 se 0) path walo ke muh p 2 add krdo jisse 4 tk phuch jaye
        {
            result.add(2 + path);
        }
          
        for(String path : paths3)       //let n =4 to n-3(1 se 0) path walo ke muh p 3 add krdo jisse 4 tk phuch jaye
        {
            result.add(3 + path);
        }
        
        return result;
               
    }
}
