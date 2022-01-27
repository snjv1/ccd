package dp__greedy;

import java.util.Scanner;

public class coinChangeCombination__7 
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        /*
        4       types of coin in array (N)
        2          
        3
        5
        6
        7           amount
        
        output  2 count // ( (2,5) , (3,4) )
        */
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i <n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int amnt =sc.nextInt();
        
        
        int[] dp= new int[amnt+1];
        
        dp[0]=1;            // mtlb  0 pay krne ka 1 trika h pay mt kro
        for(int i=0; i<arr.length; i++)          // ek ek krke pay krega sbko  jse arr m h 2 3 5
        {
            for(int j=arr[i]; j<dp.length; j++ )            // sari pay phle 2 ke coin se hogi frr 3 ke coin se frr 5 ke coin se
            {
                dp[j]= dp[j] + dp[j-arr[i]];     // 7 ki pay kr rhe h to 7 ki pay jis jis se ho chuki h vo + 5 se krne ke baad jo bacha h(2) jo ki already ek trika h so plus vo
            }
        }
        
        
        System.out.println(dp[amnt]);       // specific amount ko pay krne ke total trike
    }
    
}
