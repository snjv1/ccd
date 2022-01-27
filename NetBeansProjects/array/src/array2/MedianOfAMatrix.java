package array2;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfAMatrix {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int a[][]=new int[n][m];
        int b[]=new int[n*m];
        
        /*
        phle 2d array ko 1d array m dala fir sort krke print kr diya mid element       
        
        */
        int c1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                b[c1]=a[i][j];
                c1++;
            }
         }
        
            Arrays.sort(b);
            
            System.out.println(b[(n*m)/2]);
    }
}
