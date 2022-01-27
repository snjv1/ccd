package array2;

import java.util.*;

public class FirstReptingElemntInArry8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // test cases
        while(t-->0) 
        {
            int n=sc.nextInt();  
            int a[]=new int[n];
            int brr[]=new int[100005];
            
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                brr[a[i]]++;
            }
            //if not found then it return -1
            int ans=-1;
            for(int i=0;i<n;i++)
            {
                if(brr[a[i]]>1)
                {ans=i+1;
                    break;            
                }
            }
                      System.out.println("at posotion "+ ans );
            System.out.println("repeting element is " +a[ans-1]);
                      
        }
    }
}





