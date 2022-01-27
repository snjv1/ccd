package dp__greedy;

import java.util.Scanner;

public class fibonacci__1 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int[] qb= new int[n+1];
        int result = fibonacci(n,qb);
        System.out.println("sum of "+ n +" is "+ result);
    }
    
    public static int fibonacci(int n, int[] qb)
    {
        if(n==0 || n==1)
            return n;
        
        if( qb[n]!=0)
            return qb[n];
        
        System.out.println("hello "+ n);
        int fibm1 = fibonacci(n-1,qb);
        int fibm2 = fibonacci(n-2,qb);
        int fibr = fibm1 + fibm2;
        
        qb[n]=fibr;
        
        return fibr;
    }
    
}
