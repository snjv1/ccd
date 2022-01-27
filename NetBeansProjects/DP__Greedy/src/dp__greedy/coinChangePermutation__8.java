package dp__greedy;

import java.util.Scanner;

public class coinChangePermutation__8 
{
    public static void main(String[] args) 
    {
          
         Scanner sc= new Scanner(System.in);
        
        /*
        4       types of coin in array (N)
        2          
        3
        5
        6
        7           amount
        
        output  5 count // ( (3,2,2) , (2,3,2) , (5,2) , (2,2,3) , (2,5) )
        */
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i <n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int target =sc.nextInt();
        
        
        int[] dp= new int[target+1];
        
        dp[0]=1;            // mtlb  0 pay krne ka 1 trika h pay mt kro
        for(int amnt=0; amnt<dp.length; amnt++)          // hrr amount ko 1 1 krke pay krenge jse phle 0 frr 1 frr 2 frr 3 upto n
        {
            for(int j=0; j<arr.length; j++ )            // hrr amount ke liye sare coin se pay krenge jse phle 4namnt  ke liye sare coins se frr 5amnt k liye sare coins se frr 6amnt ke liye sare coins
            {
                if(amnt>=arr[j])                // amnt bdi ya brabar honi chahiye coin se jse hm 4 amnt pay krte h to 2rs ke coin se pay krskte h h but agr hme 4 pay krmni h or hmm 8 ke coin se pay kse krenge mtlb vo to ho hi nhi skta
                    dp[amnt]= dp[amnt] + dp[amnt-arr[j]];     // 7 ki pay kr rhe h to 7 ki pay jis jis se ho chuki h vo + 5 se krne ke baad jo bacha h(2) jo ki already ek trika h so plus vo
            }
        }
        
        
        System.out.println(dp[target]);       // specific amount ko pay krne ke total trike
    }
}
