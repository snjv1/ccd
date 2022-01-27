package array2;

import java.io.*;
import java.util.Scanner;

// kadane algorithm (  https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/  )
public class LargestsumcontiguousSubarray13 {
    public static void main(String[] args) throws Exception
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
                    /*
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    complexity N^3
                    */
                    //(max) store maximum sum of subarray
                    int maxSum=Integer.MIN_VALUE;
                
		    for (int i = 0; i <n; i++) 
                    { 
                       
                        for(int j=i; j<n; j++)
                        {
                            { 
                                int sum=0;
                                for(int k=i;k<=j;k++)
                                {
                                    sum +=arr[k];
                                }
                                maxSum=Math.max(maxSum,sum);
                            }
                        }
                    }
                    System.out.println(maxSum);
                    
                    
                    /*
                    optimized approach
                    optimized approach
                    optimized approach
                    optimized approach
                    optimized approach
                    optimized approach
                    optimized approach
                    optimized approach
                    optimized approach
                    
                    */
                    Scanner sc=new Scanner(System.in);
                    int p=sc.nextInt();
                    int ar[]=new int[p];
                    int currSum[]=new int[p+1];
                    currSum[0]=0;

                    //input of array
                    // let arr[] = {-1 4 7 2  };
                    for(int i=0;i<n;i++)
                    {
                        arr[i]=sc.nextInt();
                    }

                    // array contain sum of subarray
                    // currSum[] = {0 -1 3 10 12};
                    for(int i=1; i<=n; i++)
                    {
                        currSum[i]=currSum[i-1]+arr[i-1];
                    }

                    int res=currSum[1];
                    for(int i=2;i<=n;i++)
                    {
                        if(currSum[i]>res)
                            res=currSum[i];
                    }
                    System.out.println(res);

                   }
                
                /*
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                KADANE ALGORITH  Best approach
                
                */
                
                Scanner sc=new Scanner(System.in);
                
                int q=sc.nextInt();
                int array[]=new int[q];
                
                for(int i=0;i<q;i++)
                {
                    array[i]=sc.nextInt();
                }
                
                int maxSum=Integer.MIN_VALUE;
                int curSum=0;
                for(int i=0;i<q;i++)
                {
                    curSum += array[i];
                    if(curSum<0)
                    {
                        curSum=0;
                    }
                    maxSum=Math.max(maxSum,curSum);
                }
                System.out.println(maxSum);
                
                
                
                
              
    }
}




